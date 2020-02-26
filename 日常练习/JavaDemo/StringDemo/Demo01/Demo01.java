package StringDemo.Demo01;
/*
字符串的特点
1.字符串的内容永不可变
2.正是因为字符串内容不可变，所以字符串是可以共享使用的
3.字符串效果上是相当于char[]字符数组，但是底层原理是byte[]字节数组（字节是数据的最小单位）

 创建字符串常见的4种方法
 三种构造方法：
 public String();创建一个空白字符串
 public String(char[] array);根据字符数组来创建对应的字符串
 public String(byte[] array);根据字节数组内容，来创建对应的字符串
 一种直接创建
 String str = "sikdadi"; 直接写上双引号就是字符串对象，JVM自动 new了一个对象


 按住CTRL 点击关键字可看源码
 */
public class Demo01
{
    public static void main(String[] args)
    {
        //使用空参构造
        String str1 = new String();
        System.out.println("字符串来啦" + str1);

        //使用字符数组创建字符串
        char[] charArray = {'A','b','c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串" + str2);

        //根据字节数组创建字符串
        byte[] byteArray = {66,67,68};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串" + str3);

        //直接创建
        String str4 = "yoki";
        System.out.println(str4);

    }
}
