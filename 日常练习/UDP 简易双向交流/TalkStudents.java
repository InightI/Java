package com.lx20191213;
/*
    加入多线程,实现双向交流,模拟在线咨询
 */
public class TalkStudents
{
    public static void main(String[] args)
    {
        new Thread(new TalkReceive(9999,"老师: ")).start();//接收
        new Thread(new TalkSend(6666,"localhost",8888)).start();

    }
}
