package com.lx20191214;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    模拟登录 多个客户端请求
    面向对象思想,对各个模块进行封装
 */
public class LoginMultiServer
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("---server---");
        //1.指定端口
        ServerSocket server = new ServerSocket(8888);
        boolean isRunning = true;
//    2.阻塞时等待 accept
        while(isRunning)
        {
            Socket client = server.accept();
            System.out.println("一个客户端建立了连接");
            new Thread(new Channel(client)).start();
        }

    }

    //将输入输出流封装到一个类里
    // 一个channel 代表一个客户端
    static  class Channel implements Runnable
    {
        private Socket client;
        //输入输出流封装
        private DataInputStream dis;
        private DataOutputStream dos;
        public Channel(Socket client)
        {
            this.client = client;
            try
            {
                //输入
                dis = new DataInputStream(client.getInputStream());
                //输出
                dos = new DataOutputStream(client.getOutputStream());
            } catch (IOException e)
            {
                e.printStackTrace();
                try
                {
                    client.close();
                } catch (IOException e1)
                {
                    e1.printStackTrace();
                    release();
                }
            }

        }

        //接收数据
        private String receive()
        {
            String datas = "";
            try
            {
                datas = dis.readUTF();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            return datas;
        }
        //释放数据
        private void release()
        {
            try
            {
                if(null != dos)
                {
                    dos.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            try
            {
               if(null != dis)
               {
                   dis.close();
               }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            try
            {
                if(null != client)
                {
                    client.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        //发送数据
        private void send(String msg)
        {
            try
            {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        @Override
        public void run()
        {
//    3.操作:输入输出流操作
            String uname = "";
            String password = "";
            //4.分析数据
            String[] dataArray = receive().split("&");
            for(String info:dataArray)
            {
                String[] userInfo = info.split("=");
                if(userInfo[0].equals("uname"))
                {
                    System.out.println("你的用户名为: " + userInfo[1]);
                    uname = userInfo[1];
                }
                else if(userInfo[0].equals("password"))
                {
                    System.out.println("你的密码为: " + userInfo[1]);
                    password = userInfo[1];
                }
            }
            if(uname.equals("明日")&&password.equals("方舟"))
            {
                send("登陆成功,魔域的世界有你更精彩");
            }
            else
            {
                send("用户名或密码输出错误");
            }
            release();
        }


    }

}
