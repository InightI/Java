package Demo.Demo05Extends.Demo01Extends;
/*
Super关键字用来访问父类内容,而this关键字用来访问本类内容,用法也有三种
 1. 在本类的成员方法中,访问本类的成员变量
 2. 在本类的成员方法中,访问本类的另一个成员方法
 3. 在本类的构造方法中,访问本类的另一个构造方法

 注意:1. this()调用本类构造方法时也必须是在构造方法内的第一个语句,也只能调用一次
      2. super和this两种构造调用,不能同时使用(因为两者都必须要求在第一位)

 */
public class Demo05This
{
    int num = 10;

    public Demo05This()
    {
        //super(); 父类构造不再赠送
        this(123); //调用了自己的有参构造方法
    }
    public Demo05This(int num)
    {

    }

    public void methodA()
    {
        System.out.println("aaa");
    }

    public void methodB()
    {
        this.methodA(); //B方法调用A方法
    }
}

