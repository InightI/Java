package com.lx20191213TCP;

// 模拟登录 单向
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class LoginServer
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("---server---");
        //1.指定端口
        ServerSocket server = new ServerSocket(8888);
//    2.阻塞时等待 accept
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接");
//    3.操作:输入输出流操作
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data = dis.readUTF();
        //4.分析数据
        String[] dataArray = data.split("&");
        for(String info:dataArray)
        {
            String[] userInfo = info.split("=");
            if(userInfo[0].equals("uname"))
            {
                System.out.println("你的用户名为: " + userInfo[1]);
            }
            else if(userInfo[0].equals("password"))
            {
                System.out.println("你的密码为: " + userInfo[1]);
            }
        }
//    5.释放资源
        dis.close();
        client.close();

    }
}
