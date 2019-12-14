package com.lx20191214;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务端存储文件
 */
public class FileServer
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("---server---");
        //1.指定端口
        ServerSocket server = new ServerSocket(8888);
//    2.阻塞时等待 accept
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接");
//    3.操作:存储文件
        InputStream is = new BufferedInputStream(client.getInputStream());
        OutputStream os = new BufferedOutputStream(new FileOutputStream("文件路径"));
        byte[] flush = new byte[1024];
        int len = -1;
        while((len = is.read(flush)) != -1)
        {
            os.write(flush,0,len);
        }
        os.flush();

//    4.释放资源
        os.close();
        is.close();
        client.close();
        server.close();


    }

}
