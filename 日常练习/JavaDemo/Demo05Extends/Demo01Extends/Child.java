package Demo.Demo05Extends.Demo01Extends;
/*
 Super关键字用来访问父类内容,而this关键字用来访问本类内容,用法也有三种
 1. 在本类的成员方法中,访问本类的成员变量
 2. 在本类的成员方法中,访问本类的另一个成员方法
 3. 在本类的构造方法中,访问本类的另一个构造方法

 有了继承之后,super_class是编译完后,是.class文件当中有的一种特殊标记,这个特殊标记是一个指向,
 指向父类,相当于告诉子类,父亲是谁
 程序开始后,main()方法会先从方法区先进栈,进栈后,首先创建一个子类对象,(new出来的都在堆当中),子类当中包含一个完整的父类结构,
 先把父类的内容执行完后,才开始执行子类内容.  (记住:堆当中保存的都是地址值)

 调用子类的show()方法时,show()会先进栈, sout(num)会优先用自己的局部变量, sout(this.num)会使用
 堆上面 this代表的外围内容,num = 20 就在里面, sout(super.num) 类似.

 main()方法里的 zi.method() 调用时,会优先让方法区中子类的 method()进栈
 如果子类方法method()里super调用了父类方法,就会让父类方法method()进栈(子类方法调用父类方法)


 Java继承的特点 :
 1. Java语言是单继承的,一个类的直接父亲只有唯一一个
 2. Java语言可以多级继承.
 class A{}
 class B extends classA{};
 class C extends classB{};
 3. 一个子类的直接父亲是唯一的,但是一个父类可以拥有多个子类
 class A{}
 class B extends classA{};
 class C extends classA{};
 */
public class Child extends Father
{
    int num = 10;

    public Child()
    {
        super(20);
        System.out.printf("我是子类构造方法");
    }


}
