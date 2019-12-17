package com.lx20191212;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


/*
    接收端
    1.创建端口
    2.准备容器
    3.阻塞时接收包裹 receive
    4.分析数据
    5.释放资源
 */
public class UDPsever1
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("接收方启动中....");
        //1.创建接收端
        DatagramSocket server = new DatagramSocket(9999);
        //2.准备接受容器
        byte[] container = new byte[1024];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        //3.阻塞时接收包裹
        server.receive(packet);
        //4.分析包裹
        byte[] datas = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(datas,0,len));
        //5.释放资源
        server.close();
    }
}
