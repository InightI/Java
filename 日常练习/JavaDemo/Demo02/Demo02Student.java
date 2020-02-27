package Demo.Demo01.Demo02;

public class Demo02Student
{
    public static void main(String[] args)
    {
        Student stu1 = new Student();//new 后面 这个Student（）就是构造方法,无参构造
        System.out.println("============");
        Student stu2 = new Student("YoKi", 18);//有参构造
        System.out.println("姓名：" + stu2.getName() + " 年龄 " + stu2.getAge());
        System.out.println("=================");
        //如果需要改变对象当中的成员变量数据内容，仍然需要set方法
        stu2.setAge(19);

        System.out.println("过年长了一岁,原来18，现在 " + stu2.getAge());

    }
}
