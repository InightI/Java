package StringDemo.Demo01;
/*
String 当中获取相关的常用方法有：
public int Length(); 获取字符串当中含有的字母个数，拿到字符串长度
public String concat(String str) 将当前字符串和参数拼接成为返回值新的字符串
public char charAt(int index) 获取指定索引的单个字符（从0 开始)
public int indexOf(String str),查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1；_
 */
public class String04Get
{
    public static void main(String[] args)
    {
        //获取字符串的长度
        int length = "sidika do lifu do boku yixo".length();//含空格
        System.out.println("字符串的长度是： " +length);

        //拼接字符串
        String str1 = "sidika";
        String str2 = " and Lifu";
        String str3 = str1.concat(str2);
        System.out.println("拼接后为： " + str3);
        System.out.println("===========");

        //获取指定索引位置的单个字符
        char ch = "sidika".charAt(3);
        System.out.println("3号位置字母是 " + ch);
        System.out.println("============");

        //查找参数字符串在本字符串中首次出现的索引位置
        String str4 = "save the lost";
        String str5 = "the";
        System.out.println("参数字符串第一次出现的位置是 " +str4.indexOf(str5));
        System.out.println(str4.indexOf(str1)); //没有返回-1


    }
}
