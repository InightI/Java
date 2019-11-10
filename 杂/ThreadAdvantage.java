package com.lx20191110;

import java.util.*;
public class ThreadAdvantage
{
    public static List<String> randomList()
    {
        char[] chars = {'a','b','c','z','A','Z'};
        List<String> list = new LinkedList<>();
        for(int i = 0; i < 10_1000; i++ )
        {
            int random = new Random().nextInt(chars.length);
            char c = chars[random];
            list.add(String.valueOf(c));
        }
        return list;
    }

    public static void main(String[] args) throws InterruptedException {
        List<String> list = randomList();
        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[10];
        for(int i = 0; i < 10; i++)
        {
            final int k = i;
            threads[i] = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    Thread current = Thread.currentThread();
                    System.out.println("id=" + current.getId()
                    + ".name=" + current.getName());
                    for(int j = 0; j < 10000; j++)
                    {
                        list.get(k * 10000 +j);
                    }
                }
            },"我的线程" + k);
            threads[i].start();
        }

        for(Thread thread : threads){
            thread.join();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end - start)+"毫秒");
    }

}
