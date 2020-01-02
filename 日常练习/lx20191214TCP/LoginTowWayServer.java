package com.lx20191214;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
// 请求式响应

public class LoginTowWayServer
{
    public static void main(String[] args) throws IOException {
        System.out.println("---server---");
        //1.指定端口
        ServerSocket server = new ServerSocket(8888);
//    2.阻塞时等待 accept
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接");
//    3.操作:输入输出流操作
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data = dis.readUTF();
        String uname = "";
        String password = "";

        //4.分析数据
        String[] dataArray = data.split("&");
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
        //输出
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
//        dos.writeUTF("uanme=" + uname + "&" + "password=" + password );
        if(uname.equals("明日")&&password.equals("方舟"))
        {
            dos.writeUTF("登陆成功");
        }
        else
        {
            dos.writeUTF("用户名或密码输出错误");
        }
        dos.flush();
//    5.释放资源
        dis.close();
        client.close();

    }

}
