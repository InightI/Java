package StringDemo.Demo01;
/*
String当中与转换相关的常用方法有：

public char[] toCharArray(); 将当前字符串拆分为字符数组作为返回值
public byte[] getBytes(); 获得当前字符串底层的字节数组
public String replace(CharSequence oldString, CharSequence new String);
将所有出现的旧字符串替换成新的字符串，返回替换之后的新字符串
//CharSequence 是一个接口,简单来说可以当成String 来使用
 */
public class Demo06StringConvert
{
    public static void main(String[] args)
    {
        //转换成字符数组
        char[] ch = "sikadi".toCharArray();
        System.out.println("第一号下标字符是 " +ch[1]);
        System.out.println("该字符数组的长度是 " + ch.length);
        System.out.println("============");

        //转换成为字节数组
        byte[] bytes = "kurumi".getBytes();
        System.out.println("打印的是ASCII码 ");
        for(int i : bytes)
        {
            System.out.println( i);
        }
        System.out.println("==============");
        //字符的内容替换
        String str1 = "kurumi wa";
        String str2 = str1.replace("u","I");
        System.out.println("替换后的新字符串为 " +str2);

        String str3 = "会不会玩啊, wdnmd! wdnmd,wdnmd"; //可以过滤哟 -_-
        String str4 = str3.replace("wdnmd","*****");
        System.out.println(str3);
        System.out.println(str4);

    }
}
