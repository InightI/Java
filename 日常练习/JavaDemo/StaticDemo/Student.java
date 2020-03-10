package Demo.StaticDemo;

public class Student
{
    private int id;
    private String name;
    private int age;
    private static int room = 202;
    private static int idCount = 0;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getRoom()
    {
        return room;
    }

    public int getId()
    {
        return id;
    }
}
