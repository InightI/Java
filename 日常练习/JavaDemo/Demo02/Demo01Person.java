package Demo.Demo01.Demo02;

public class Demo01Person
{
    public static void main(String[] args)
    {
        Person per = new Person();
        per.name = "小白";
        per.sayHello("大白"); //谁调用的方法谁就是this,这个this就是per
    }
}
