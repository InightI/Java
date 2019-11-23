package com.lx20191122;
/*
利用多线程循环输出ABC
 */
public class PrintABC
{
    private static Boolean flagA = true;
    private static Boolean flagB = false;
    private static Boolean flagC = false;

    public static void main(String[] args)
    {
        final Object lock = new Object();
        Thread aThread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < 10;)
                {
                    synchronized (lock)
                    {
                        if(flagA)
                        {
                            System.out.println("A");
                            flagA = false;
                            flagB = true;
                            flagC = false;
                            lock.notifyAll();
                            i++;
                        }
                        else
                        {
                            try
                            {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }
            }
        });
        Thread bThread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < 10;)
                {
                    synchronized (lock)
                    {
                        if(flagB)
                        {
                            System.out.println("B");
                            flagA = false;
                            flagB = false;
                            flagC = true;
                            lock.notifyAll();
                            i++;
                        }
                        else
                        {
                            try
                            {
                                lock.wait();
                            } catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });

        Thread cThread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i = 0; i < 10;)
                {
                    synchronized (lock)
                    {
                        if(flagC)
                        {
                            System.out.println("C");
                            flagA = true;
                            flagB = false;
                            flagC = false;
                            lock.notifyAll();
                            i++;
                        }
                        else
                        {
                            try
                            {
                                lock.wait();
                            } catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }
                }

            }
        });
        bThread.start();
        aThread.start();
        cThread.start();
    }
}
