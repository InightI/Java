package com.lx20191214;

import java.io.*;
import java.net.Socket;

/*
    客户端上传文件
 */
public class FileClient
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("---client----");
        //1.建立连接: 使用Socket 创建客户端 + 服务的地址和端口
        Socket client = new Socket("localhost",8888);
        //2.操作:拷贝上传
        InputStream is = new BufferedInputStream(new FileInputStream("文件路径"));
        OutputStream os = new BufferedOutputStream(client.getOutputStream());
        //拷贝文件用字节数组
        byte[] flush = new byte[1024];
        int len = -1;
        while((len = is.read(flush)) != -1)
        {
            os.write(flush,0,len);
        }
        os.flush();
        //3.释放资源
       os.close();
       is.close();
       client.close();

    }
}
