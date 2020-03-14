package Demo.StaticDemo;
/*
如果一个成员变量使用了static关键字,那么这个变量不再属于自己,而是属于所在的类,多个对象共享同一份数据
 */
public class Demo01StaticField
{
    public static void main(String[] args)
{
    Student one = new Student("sikadi",18);

    System.out.println("姓名 " + one.getName() + " 年龄 " + one.getAge()
            + " sikadi的教室为 " +one.getRoom() + " 学号为 " + one.getId() ); //因为room通过static进行修饰
    Student two = new Student("Lifu",17);
    System.out.println("姓名 " + two.getName() + " 年龄 " + two.getAge()
            + " Lifu的教室为 " + two.getRoom() + " 学号为 " + two.getId());

}
}
