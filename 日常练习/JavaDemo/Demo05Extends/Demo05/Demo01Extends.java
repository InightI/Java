package Demo.Demo05Extends.Demo05;
/*
在继承的关系中,"子类就是一个父类",子类可以被当作父类看待
例如父类是员工,子类是老师,那么老师就是一个父类,关系 is-a

 */
public class Demo01Extends
{
    public static void main(String[] args)
    {
        //创建一个子类对象
        Teacher one = new Teacher();
        //Teacher继承了父类的方法
        one.method();
    }

}
