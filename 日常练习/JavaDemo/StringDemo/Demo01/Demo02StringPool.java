package StringDemo.Demo01;
/*
字符串常量池：程序中直接写上双引号字符串，就在字符串常量池中
new出来的不在常量池中

对于基本类型来说：== 是进行数值的比较
对于引用类型来说：== 是进行地址值的比较
 */
public class Demo02StringPool
{
    public static void main(String[] args)
    {
        String str1 = "abc";
        String str2 = "abc";

        char[] ch1 = {'a','b','c'};
        String str3 = new String(ch1);

        char[] ch2 = {'a','b','c'};
        String str4 = new String(ch2);

        System.out.println(str1 == str2);//因为有字符串常量池，没有创建新对象，常量池中的字符串对象地址一样
        System.out.println(str3 == str4);//两者没有在字符串常量池中，对象保存的地址都不一样；
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
