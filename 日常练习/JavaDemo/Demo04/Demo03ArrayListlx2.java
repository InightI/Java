package Demo.Demo04;

import java.util.ArrayList;

//定义四个学生对象,添加到集合,并遍历集合
public class Demo03ArrayListlx2
{
    public static void main(String[] args)
    {
        Student one = new Student("sikadi",16);
        Student two = new Student("kurumi", 17);
        Student three = new Student("yukiwa", 18);
        Student four = new Student("hihihi", 20);

        ArrayList<Student> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

       for(Student i : list)
       {
           System.out.println("姓名 " + i.getName() + " 年龄 " + i.getAge() + " ID " + i.getId());
       }
    }
}

class Student
{
    private String name;
    private int age;
    private int id;
    private static int  increment = 1;


    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.id = increment++;
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

    public int getId()
    {
        return id;
    }

}


