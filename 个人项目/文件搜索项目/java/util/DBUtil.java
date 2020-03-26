package util;

import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;

import javax.sql.DataSource;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil
{

    private static volatile DataSource DATA_SOURCE;

   /*
   提供获取数据库连接池的功能：
   使用单例模式（多线程安全版本）
    */
    private static DataSource getDataSource()
    {
        if(DATA_SOURCE == null) //为了在锁之外也能保证可见性,使用volatile修饰,可以提高效率(没有写操作,不涉及原子性,没有加锁)
        {
            synchronized (DBUtil.class)//加锁,保证安全性
            {
                if(DATA_SOURCE == null) //为了保证接下来的线程new是同一个对象,而不是new一个新的对象
                {
                    SQLiteConfig config = new SQLiteConfig();
                    config.setDateStringFormat(Util.DATE_PATTERN);

                    //使用volatile关键字禁止指令重排序,防止将赋值操作拆分多步执行
                    DATA_SOURCE = new SQLiteDataSource(config);

                    ((SQLiteDataSource)DATA_SOURCE).setUrl(getUrl());
                }
            }
        }
        return DATA_SOURCE;
    }

    //获取sqlite数据库文件url的方法
    private static String getUrl()
    {
        try
        {
            // 获取target编译文件夹的路径
            // 通过classLoader.getResource()/classLoader.getResourceAsStream()这样的方法
            // 默认的根路径为编译文件夹路径（target/classes）
            URL classesURL = DBUtil.class.getClassLoader().getResource("./");

            // 获取target/classes文件夹的父目录路径
            String dir = new File(classesURL.getPath()).getParent();

            String url = "jdbc:sqlite://" + dir + File.separator + "everythinglike.db";
            url = URLDecoder.decode(url,"UTF-8");
            System.out.println("获取数据库文件路径: "  + url);
            return url;
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
            throw new RuntimeException("获取数据库文件路径失败 ",e);
        }
    }

    /*
     * 提供获取数据库连接的方法：
     * 从数据库连接池DataSource.getConnection()来获取数据库连接
     */
    public static Connection getConnection() throws SQLException
    {
        return getDataSource().getConnection();
    }

    public static void main(String args[])
    {
        for(int i = 0; i < 10; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    DataSource dataSource = DBUtil.getDataSource();
                }
            }).start();
        }
    }

    public static void close(Connection connection, Statement statement)
    {
        close(connection,statement,null);
    }

    /**
     * 释放数据库资源：
     * @param connection 数据库连接
     * @param statement sql执行对象
     * @param resultSet 结果集
     */
    public static void close(Connection connection, Statement statement, ResultSet resultSet)
    {
        try
        {
            if(connection != null)
            {
                connection.close();
            }
            if (statement != null)
            {
                statement.close();
            }
            if(resultSet != null)
            {
                resultSet.close();
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException("释放数据库资源出错",e);
        }
    }


}
