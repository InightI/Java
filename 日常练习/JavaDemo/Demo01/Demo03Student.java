package Demo.Demo01;

public class Demo03Student
{
    public static void main(String[] args)
    {
        Sdudent st = new Sdudent();
        st.setAge(18);
        st.setName("LiFu");
        st.setFemale(true);
        System.out.println("名字是： " + st.getName());
        System.out.println("年龄是： " + st.getAge());
        System.out.println("是不是妹子 ：" + st.isFemale());
    }

}
