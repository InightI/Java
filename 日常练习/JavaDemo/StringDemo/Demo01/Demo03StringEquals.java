package StringDemo.Demo01;
/*
字符串内容比较，可以用两个方法
  一.  public boolean equals(Object obj),参数可以是任何对象，
    只有参数是一个字符串并且内容相同才会true,否则是false
注意
1.任何对象都能用Object接收
2.equals方法具有对称性，a.equals(b) 与 b.equals(a) 效果一样
3.如果比较双方一个常量一个变量，推荐把常量写在前面 即 "abc".equals(str)

二。public boolean equalsIgnoreCase(String str) 忽略大小写进行内容比较
 */
public class Demo03StringEquals
{
    public static void main(String[] args)
    {
        String str1 = "yoki";
        String str2 = "yoki";
        char[] ch1 = {'y','o','k','i'};
        String str3 = new String(ch1);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("yoki".equals(str1));

        String str4 = null;
        System.out.println("yoki".equals(str4));
     //   System.out.println(str4.equals("yoki")); 如果变量为null, 会发生空指针异常，所以建议常量放前面
        System.out.println("=============");
        String str5 = "Yoki";
        System.out.println(str5.equalsIgnoreCase(str1)); //忽略大小写
    }
}
