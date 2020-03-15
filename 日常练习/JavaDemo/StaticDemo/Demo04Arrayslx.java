package Demo.StaticDemo;

import java.util.Arrays;

/*
使用Arrays相关API,将一个随机字符串中的所有字符升序排列,并倒序打印
 */
public class Demo04Arrayslx
{
    public static void main(String[] args)
    {
        String str = "abcdefgjdsa9ad7ada12knlzc";
        char[] ch = str.toCharArray();//将字符串转换成数组形式
        Arrays.sort(ch);//升序排列数组
        for(int i = ch.length - 1; i >= 0; i--) //倒序打印
        {
            System.out.print(ch[i]);
        }
    }
}
