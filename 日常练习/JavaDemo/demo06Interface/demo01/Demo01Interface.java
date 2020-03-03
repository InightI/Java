package Demo.demo06Interface.demo01;

/*
接口就是多个类的公共规范.
接口是一种引用数据类型,最重要的内容就是其中的抽象方法

定义一个接口的格式:
public interface 接口名称{接口内容};

 接口使用步骤:
 1.接口不能直接使用,必须有一个"实现类" 来"实现该接口".
 格式: public class 实现类名称 implements 接口名称{...};

 2.接口的实现类必须覆盖重写接(实现)口内的所有抽象方法

 3.创建实现类的对象,进行使用

 注意:
 如果实现类并没有覆盖重写接口中的所有抽象方法,呢么这个实现类自己必须是抽象类

 1.接口的默认方法,可以通过接口实现类对象,直接调用
 2.接口的默认方法,也可以被接口实现类进行覆盖重写
 3.接口的默认方法即使没有被它的实现类实现,它的实现类也不会报错

 从Java8 开始,接口当中允许定义静态方法
 格式:
 public static 返回值类型 方法名称(参数列表){}

 注意: 不能通过接口实现类的对象来调用接口当中的静态方法
 正确用法:通过接口名称,直接调用其中的静态方法
 格式:
 接口名称.静态方法名(参数);

 1.普通私有方法,解决多个默认方法之间重复的代码问题
 格式:
 private  返回值类型 方法名称(参数列表)
 2.静态私有方法  解决多个静态方法之间重复代码的问题
 private static 返回值类型 方法名称(参数列表)
 */
public class Demo01Interface
{
    public static void main(String[] args)
    {
        MyInterfaceAbstractImpl im = new MyInterfaceAbstractImpl();
        im.method1();
        im.method2();
        im.method05();
        //通过接口名称来调用静态方法
        MyInterfaceAbstract.staticMethod();
    }
}
