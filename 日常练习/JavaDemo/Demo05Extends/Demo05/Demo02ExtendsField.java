package Demo.Demo05Extends.Demo05;
/*
在父类的继承关系当中,如果成员变量重名,则创建子类对象,访问有两种方式
直接通过子类对象访问成员变量
    等号左边是谁,就优先用谁,没有则向上找
间接通过成员方法访问成员变量

重名成员方法也是类似,创建的对象是谁,就优先用谁
son.method  就有先调用子类的method
father.method 就用先调用父类的method

重名情况:
局部变量:       直接写成员变量名
本类的成员变量:  this.成员变量名
父类的成员变量:  super.成员变量名

注意:无论是成员变量还是成员方法,如果没有都是向上找,不会向下找子类的



 */
public class Demo02ExtendsField
{
    public static void main(String[] args)
    {
        Fashi fashi = new Fashi(); //创建父类对象
        System.out.println(fashi.oneFashi);//父类只能用父类内容,不能用子类
        System.out.println("==============");

        Fashu fashu = new Fashu();

        System.out.println(fashu.oneFashi); //子类调用父类方法
        System.out.println(fashu.oneFashu); //子类调用本类方法

        System.out.println("===================");
        System.out.println("调用子类就优先子类变量 " + fashu.num); //成员变量名字一样时,等号左边是谁,就优先用谁
        System.out.println("调用父类就优先父类变量 " + fashi.num);

        System.out.println("+++++++++++");
        fashu.printNum();

    }

}
