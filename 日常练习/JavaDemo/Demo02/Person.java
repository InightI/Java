package Demo.Demo01.Demo02;
/*
当方法的局部变量和类的成员变量重名时，根据就近原则，优先使用局部变量
如果要访问本类中的成员变量，需要使用 this.成员变量名
this一定是写在一个方法的内部
//谁调用的方法谁就是this,
 */
public class Person
{
    String name; //我自己的名字

    public void sayHello(String who)//who是对方的名字
    {
        System.out.println(who + ", 你好，我是" + this.name);
    }
}
