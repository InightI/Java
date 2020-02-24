package Demo.Demo01;

public class Person
{
    String name;
    private int age;

    public void show()
    {
        System.out.println("我叫：" + name + ", 今年" + age +"岁");
    }

    public void setAge(int num)
    {
        if(num < 100 && num > 0)
        {
            age = num;
        }
        else System.out.println("您的年龄不合法");

    }

    public int getAge()
    {
        return age;
    }

}
