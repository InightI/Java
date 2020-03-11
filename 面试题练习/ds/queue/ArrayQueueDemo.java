package ds.queue;

import java.util.Scanner;

public class ArrayQueueDemo
{
    public static void main(String[] args)
    {
        ArrayQueue queue = new ArrayQueue(3);
        char key = ' ';//接收用户输入
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while(loop)
        {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出队列");
            System.out.println("a(add): 添加数据队列");
            System.out.println("g(get): 从队列取出元素");
            System.out.println("h(head): 查看队列头数据");
            key = sc.next().charAt(0);//接收一个字符
            switch (key)
            {
                case 's' :
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数");
                    int value = sc.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try
                    {
                        int res = queue.getQueue();
                        System.out.println("取出的数据是: " + res);
                    } catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h' :
                    try
                    {
                        int res = queue.headQueue();
                        System.out.println("取出的头数据是: " + res);
                    } catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    sc.close();
                    loop = false;
                        break;
                    default:
                        break;

            }

        }
        System.out.println("程序已退出");
    }
}

class ArrayQueue
{
    private int maxSize;//表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int arr[];//数组用于存放数据,模拟队列

    public ArrayQueue(int arrMaxSize)
    {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头部,front = -1是指向队列头(0)的前一个位置
        front = -1;//指向队列尾部,即指向队列列最后一个数据
    }

    //判断队列是否为满
    public boolean isFull()
    {
        return rear == maxSize - 1;
    }

    public boolean isEmpty()
    {
        return rear == front;
    }

    public void addQueue(int n)
    {
        if(isFull())//判断队列是否已满
        {
            System.out.println("队列已满,不能再加了");
        }
        arr[rear] = n;
        rear++;
    }

    public int getQueue()//获取队列元素
    {
        if(isEmpty())//判断队列是否为空
        {
            throw new RuntimeException("队列为空,没有元素");
        }
        front++;
        return arr[front];
    }

    public void showQueue()//显示队列所有数据
    {
        if(isEmpty())
        {
            System.out.println("队列为空.没有元素");
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    public int headQueue()//显示队列头数据
    {
        if(isEmpty())
        {
            throw new RuntimeException("队列为空,没有元素");
        }
        return arr[front + 1];
    }
}
