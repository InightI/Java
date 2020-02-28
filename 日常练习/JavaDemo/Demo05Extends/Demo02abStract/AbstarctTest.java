package Demo.Demo05Extends.Demo02abStract;
/*
抽象方法: 就是加上abstract 关键字,然后去掉大括号,直接分号结束
抽象类: 抽象方法所在的类,必须是抽象类才行,在 class 前加上 abstract即可

如果使用抽象类和抽象方法
1. 不能直接创建(new)抽象类对象
2. 必须用一个子类来继承抽象类
3. 子类必须覆盖重写抽象父类中的所有抽象方法,否则会编译报错,除非该子类也是抽象类
覆盖重写(实现):子类去掉抽象方法的abstract关键字,然后然后方法体大括号
4.创建子类进行使用

抽象类注意事项:
2.抽象类中,可以有构造方法(有默认的super()),是供子类创建对象时,初始化父类成员使用的
3.抽象类中不一定包含抽象方法,但是有抽象方法的类必定是抽象类

 */
public class AbstarctTest
{
    public static void main(String[] args)
    {
        Cat1 cat = new Cat1();
        cat.eat();
    }

}
