package javademo.lamdademo;

public class LamdaDemo
{
    public static void main(String[] args)
    {
        invokeCook(() -> System.out.println("吃饭了!"));
        System.out.println("=================");
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("匿名内部类实现多线程");
            }
        }).start();
        System.out.println("===================");
       new Thread(() -> System.out.println("Lamda表达式实现多线程"));
    }

    public static void invokeCook(Cook cook)
    {
        cook.makeFood();
    }
}
