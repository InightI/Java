package com.lx20191213TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建服务器
 */
public class Server
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
        System.out.println(data);
//    4.释放资源
        dis.close();
        client.close();

    }
}
