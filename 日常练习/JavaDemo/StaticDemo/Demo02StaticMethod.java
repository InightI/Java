package Demo.StaticDemo;
/*
一旦使用static修饰成员变量,那么这就成为了静态方法,静态方法不属于对象,而是属于类
如果没有static关键字,就必须先创建对象,然后通过对象才能使用它
如果有了static关键字,那么不需要创建对象,直接就能通过类名称来使用它

无论是成员变量还是成员方法,如果有了static,都推荐使用类名称进行调用
静态变量:类名称.静态变量
静态方法:类名称.静态方法()

根据类名称访问静态变量时,全程跟对象没关系,只和类有关系

1. 静态方法可以访问静态变量,不能直接访问非静态
原因:因为在内存当中现有的静态内容,后有的非静态内容
2. 静态方法中不能用this
原因: this代表当前对象,通过谁调用的方法,谁就是当前对象,
        调用静态方法时,不应该通过对象调用,
 */
public class Demo02StaticMethod
{
    public static void main(String[] args)
    {
        MyClass my = new MyClass();//先创建对象
        //然后才能使用没有static关键字的内容
        my.method();

        my.methodStatic();//对象名调用,不推荐,这种写法在编译后也会被javac翻译成"类名称.静态方法"
        MyClass.methodStatic();//类名称调用,推荐

        //对于本类中的静态方法可以省略类名称
        method();
        Demo02StaticMethod.method();//完全等效

    }

    public static void method()
    {
        System.out.println("自己的方法");
    }
}
