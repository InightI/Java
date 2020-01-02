package com.lx20191214;

import java.io.*;
import java.net.Socket;

/*
    模拟登录 双向

 */
public class LoginTowWayClient
{
    public static void main(String[] args) throws IOException {
        System.out.println("---client----");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名");
        String uname = console.readLine();
        System.out.println("请输入密码");
        String password = console.readLine();
        //1.建立连接: 使用Socket 创建客户端 + 服务的地址和端口
        Socket client = new Socket("localhost",8888);
        //2.操作:输入输出流操作
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF("uname=" +  uname + "&" + "password=" + password);
        dos.flush();

        DataInputStream dis = new DataInputStream(client.getInputStream());
        String result = dis.readUTF();
        System.out.println(result);
        //3.释放资源
        dos.close();
        client.close();

    }


}
