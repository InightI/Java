package com.lx20191214;

import java.io.*;
import java.net.Socket;

//模拟登录 多个客户端请求
//面向对象思想,对各个功能进行封装
public class LoginMultiClient
{

    public static void main(String[] args) throws IOException
    {
        System.out.println("---client----");
        //1.建立连接: 使用Socket 创建客户端 + 服务的地址和端口
        Socket client = new Socket("localhost",8888);
        //2.操作:输入输出流操作//先请求,后响应
        new Send(client).send();
        new Receive(client).receive();
        //3.释放资源
        client.close();

    }
    //发送
    static class Send
    {
        private Socket client;
        private DataOutputStream dos;
        private BufferedReader console;
        private String msg;
        public Send(Socket client)
        {
            console = new BufferedReader(new InputStreamReader(System.in));
            this.msg = init();
            this.client = client;
            try
            {
                dos = new DataOutputStream(client.getOutputStream());
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        private String init()
        {
            try
            {
                System.out.println("请输入用户名");
                String uname = console.readLine();
                System.out.println("请输入密码");
                String password = console.readLine();
                return "uname=" + uname + "&" + "password=" + password;
            } catch (IOException e)
            {
                e.printStackTrace();
                return "";
            }
        }
        public void send()
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

    }
    //接收
    static class Receive
    {
        private Socket client;
        private DataInputStream dis;
        public Receive(Socket client)
        {
            this.client = client;
            try
            {
                dis = new DataInputStream(client.getInputStream());
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        public void receive()
        {
            try
            {
                String result = dis.readUTF();
                System.out.println(result);
            } catch (IOException e)
            {
                e.printStackTrace();
            }

        }

    }
}
