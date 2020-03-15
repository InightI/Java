package Demo.StaticDemo;
/*

 */
public class MyClass
{
    int num = 66; //成员变量
    static int silence; //静态变量

    //成员方法
    public void method()
    {
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(silence);
    }

    //静态方法
    public static void methodStatic()
    {
        System.out.println("我是静态方法");
        System.out.println(silence);//静态方法可以访问静态变量,不能直接访问成员变量
    }
}
