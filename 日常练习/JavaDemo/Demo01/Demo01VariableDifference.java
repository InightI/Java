package Demo.Demo01;
//成员变量与局部变量的区别
/*
1.定义的位置不一样
局部变量：在方法的内部
成员变量：在方法的外部，直接写在类当中

2.作用范围不一样
局部变量：只能在方法中使用
成员变量：整个类中都可以使用

3.默认值不一样
局部变量：没有默认值，如果要想使用，必须手动进行赋值
成员变量：如果没有赋值，会有默认值，规则和数组一样

4.内存的位置不一样
局部变量：位于栈内存
成员变量：位于堆内存

5.生命周期不一样
局部变量;随着方法进栈而诞生，出栈而消失
成员变量：随着创建对象而诞生，对象被垃圾回收而消失

 */
public class Demo01VariableDifference
{
    String name; //成员变量

    public void methodA()
    {
        int num = 20; //局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param) //方法的参数就是局部变量
    {
        System.out.println(param);
        int age; //没赋值不能用
        System.out.println(name);
    }

}
