package com.lx20191213;
/*
    模拟老师
 */
public class TalkTeacher
{
    public static void main(String[] args)
    {
        new Thread(new TalkSend(7777,"localhost",9999)).start();//发送
        new Thread(new TalkReceive(8888,"学生: ")).start();

    }
}
