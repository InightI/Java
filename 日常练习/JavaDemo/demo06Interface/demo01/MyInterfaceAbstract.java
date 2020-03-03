package Demo.demo06Interface.demo01;
/*
在任何Java版本中,接口都能定义抽象方法
格式:
public abstract 返回值类型 方法名称(参数列表)

注意事项:
1.接口当中的抽象方法,修饰符必须是两个固定的关键字: public abstract
2.这两个关键字修饰符,可以选择性省略
3.方法的三要素:返回值类型,方法名称,参数列表 可以根据业务情况随意定义

注意:
1.接口当中的常量,可以省略 public static final, 不写也默认是这样
2.接口当中的常量必须进行复制,不能不赋值
3.接口中常量使用完全大写字母,用下划线进行分割(推荐命名规则
 */
public interface MyInterfaceAbstract
{
    public static final int num = 10;//
    //这是一个抽象方法
    public abstract void method1();
    //下面的都是抽象方法
    public  void method2();

    abstract void method3();

    void method4();


    public default void method05()
    {
        System.out.println("我是在接口里新添加的默认方法");
    }
    public static void staticMethod()
    {
        System.out.println("我是接口里的静态方法");
    }
}
