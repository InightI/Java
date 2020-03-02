package Demo.Demo05Extends.Demo05;

public class Fashu extends Fashi
{
    String oneFashu = "我是火球术";
    int num = 10;
    public void fashu()
    {
        System.out.printf("我是法术类-子类");
    }
    public void printNum()
    {
        int num = 5;
        System.out.println("这是子类方法同名局部变量 " + num);
        System.out.println("这是子类方法同名成员变量 " + this.num);
        System.out.println("这是父类同名成员变量 " + super.num);
    }
}
