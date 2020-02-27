package Demo.Demo03;

/*
创建对象基本格式
类名称 对象名 = new 类名称();

就是只有右边的对象,没有左边的名字和赋值运算符
new 类名称();
匿名对象只能使用唯一的一次,下次再用就必须创建一个新对象
所以适合一个对象只需要使用唯一的一次的情况

 */
public class Demo01Anonymous
{
    public static void main(String[] args)
    {
        //左边的one 是对象的名字
        Person one = new Person();
        one.name = "sikadi";
        one.showName();
        System.out.println("============");

        //匿名对象
        new Person().name = "yuki";
        new Person().showName();
    }
}
