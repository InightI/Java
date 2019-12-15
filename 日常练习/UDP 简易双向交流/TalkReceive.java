package com.lx20191213;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
    接收端:使用面向对象封装
 */
public class TalkReceive implements Runnable
{
    private DatagramSocket server;
    private String from;
    public TalkReceive(int port,String from)
    {
        this.from = from;
        try
        {
            server = new DatagramSocket(port);
        } catch (SocketException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        while(true)
        {
            //准备容器
            byte[] container = new byte[1024 * 60];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            //阻塞式接收包裹
            try
            {
                server.receive(packet);
                //分析数据
                byte[] datas = packet.getData();
                int len = packet.getLength();
                String data = new String(datas,0,len);
                System.out.println(from + data);
                if(data.equals("bye"))
                {
                    break;
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        server.close();
    }
}
