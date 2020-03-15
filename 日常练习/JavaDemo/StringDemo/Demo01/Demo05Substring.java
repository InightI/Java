package StringDemo.Demo01;

/*
字符串截取方法:
public String substring(int index);截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin, int end) 截取从begin开始,一直到end结束，中间的字符串
[begin,end) 是左闭右开区间，包含左边，不包含右边

 */
public class Demo05Substring
{
    public static void main(String[] args)
    {
        String str1 = "sidika";
        String str2 = str1.substring(2); //从零开始数
        System.out.println("从2号位置开始的字符串是 " + str2);
        String str3 = str1.substring(2, 5);
        System.out.println("[2,5) 区间的字符串是 " + str3);

        //看起来内容打印的不同，但字符串的内容是没有改变的
        //自动创建了一个新的字符串，共两个字符串，只是改变了str4当中保存的地址，字符串本身内容还是没变
        String str4 = "Luxiya";
        System.out.println(str4);
        str4 = "yoki";
        System.out.println(str4);
    }
}
