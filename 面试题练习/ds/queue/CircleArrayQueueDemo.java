package ds.queue;

import java.util.Scanner;

public class CircleArrayQueueDemo
{
    public static void main(String[] args)
    {
        CircleArrayQueue queue = new CircleArrayQueue(4);//有效元素是3
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



class CircleArrayQueue
{
    private int maxSize;//数组最大容量
    private int front;//front指向队列第一个元素
    private int rear;//指向队列倒数第二个元素,与队尾最后一个预留一个空间
    private int [] arr;//数组用于存放数据,模拟队列

    public CircleArrayQueue(int arrMaxSize)
    {
        maxSize = arrMaxSize;
        arr = new int [maxSize];
    }

    public boolean isFull()
    {
        return (rear + 1) % maxSize == front;
    }

    public void addQueue(int n)
    {
        if(isFull())
        {
            System.out.println("队列已满");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize; //将rear后移,要考虑取模
    }

    public int getQueue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("队列为空,没有数据");
        }
        //取数据 1.先把front对应的值放到一个临时变量中
        //2.再将front 后移
        //3.将临时保存的变量返回
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public boolean isEmpty()
    {
        return rear == front;
    }

    public void showQueue()
    {
        if(isEmpty())
        {
            System.out.println("队列为空,没有元素");
            return;
        }
        for(int i = 0; i < front + size(); i++)
        {
            System.out.printf("arr[%d] = %d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    public int size()
    {
        return (rear + maxSize - front) % maxSize;
    }

    public int headQueue()
    {
        if(isEmpty())
        {
            throw new RuntimeException("队列为空,没有元素");
        }
        return arr[front];
    }

}
