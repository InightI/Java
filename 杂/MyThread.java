package com.lx20191110;
import java.util.*;
public class MyThread
{
    public static void main(String[] args)
    {

        long start = System.currentTimeMillis();
        List<String> list = randomList();
        for(int i = 0; i < 10; i++)
        {
            final int k = i;
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for(int j = 0; j < 10000; j++)
                    {
                        list.get(k * 10000 + j);
                    }
                }
            }).start();
        }
        //不调用join时,创建线程会耗时较长,下边的main方法的代码会优先执行
        //如果调用join,后面的main方法会一直等待线程运行,死掉后才执行

        //第一种做法,线程让步
        while(Thread.activeCount() > 2)
        {
            Thread.yield();
        }
        //第二种方法 调入线程等待
//        for(Thread thread :threads)
//        {
//            thread.join();
//        }
       long end = System.currentTimeMillis();
        System.out.println( "耗时" + (end - start) + "毫秒");
    }

    public static List<String> randomList()
    {
        char[] chars = {'a', 'b', 'c','d','A'};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 10_0000; i++)
        {
            int random = new Random().nextInt(chars.length);
            char c = chars[random];
            list.add(String.valueOf(c) );
        }
        return list;
    }


}
