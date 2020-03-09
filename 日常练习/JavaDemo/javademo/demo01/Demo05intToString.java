package javademo.demo01;

public class Demo05intToString
{
    public static void main(String[] args)
    {
        //基本类型->字符串类型
        String str1 = 10 + "";
        System.out.println(str1 + 10);//1010

        String str2 = Integer.toString(20);
        System.out.println(str2 + 20);

        String str3 = String.valueOf(30);
        System.out.println(str3 + 30);

        System.out.println("==================");
        //字符串->基本类型
        int i = Integer.parseInt("100");
        System.out.println(i + 400);
    }
}
