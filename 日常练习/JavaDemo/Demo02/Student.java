package Demo.Demo01.Demo02;
/*
构造方法是专门用来创建对象的方法，通过关键字new创建对象时，就是在调用构造方法
格式：
public 类名称（参数类型 参数名称）
{
    方法体
}
注意事项：
1.构造方法的名称包括大小写必须与类名称完全一样
2.构造方法不要写返回值类型，void 也不用
3.构造方法不能return一个具体的返回值
4.如果不写构造方法，编译器会自动赠送一个构造方法，没有参数，方法体什么都不做
5.一旦编写了至少一个构造方法，编译器不会再赠送

重载：方法名称相同，参数列表不同
 */
public class Student
{
    //成员变量
    private String name;
    private int age;

    //无参数构造方法
    public Student()
    {
        System.out.println("这就是无参构造方法，构造方法执行啦！");

    }
    //全参数构造方法
    public Student(String name, int age)
    {
        System.out.println("全参构造方法执行啦! 不需要Setter方法来赋值了");
        this.age = age;
        this.name = name;
    }
    //Getter and Setter
    public void setName(String name)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    public void setAge(int num)
    {
        age = num;
    }
    public int getAge()
    {
        return age;
    }
}
