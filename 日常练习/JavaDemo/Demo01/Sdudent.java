package Demo.Demo01;
//基本类型中的boolean值，Getter方法要写成isxxx形式，setxxx不变
public class Sdudent
{
    private String name; //姓名
    private int age;
    private boolean female;// 是不是妹子

    public void setName(String str)
    {
        name = str;
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

    public void setFemale(boolean b)
    {
        female = b;
    }
    public boolean isFemale()
    {
        return female;
    }
}
