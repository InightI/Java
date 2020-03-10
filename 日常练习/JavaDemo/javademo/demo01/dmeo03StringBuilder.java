package javademo.demo01;

public class dmeo03StringBuilder
{
    public static void main(String[] args)
    {
        StringBuilder sb1 = new StringBuilder("sikadi");
        System.out.println(sb1);

        //使用append方法无需接收返回值
        sb1.append(10);
        sb1.append("Lifu");
        sb1.append("||luxiya");
        System.out.println(sb1);
        System.out.println();
        System.out.println("==========================");
        //链式编程:方法的返回值是一个对象,可以根据对象继续调用方法
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Lifu").append(" do ").append("mo ").append("ximasi");
        System.out.println(sb2);
        System.out.println("==================");
        sb2.reverse();
        System.out.println("字符串反转后为");
        System.out.println(sb2);
    }
}
