package StringDemo.Demo01;

import java.util.Scanner;

/*
题目:键盘输入一个字符串,并且统计其中各种字符串出现的次数
种类有:大写字母,小写字母,数字,其他

思路:
1.键盘输入,用Scanner
2.接收字符串,用String str = sc.next()
3.定义四个变量, 分别代表四个字符各自出现的次数
4.需要对字符串一个字一个字检查,String-->char[], 方法就是toCharArray()
5.遍历char[]字符数组,对当前的字符种类进行判断,用四个变量进行++操作
6.打印输出四个变量

 */
public class Demo09StringCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String input = sc.next(); //接收字符串

        int countUpper = 0;//大写字母出现次数
        int countLower = 0;//小写字母出现次数
        int countNumber = 0; //数字出现次数
        int countOther = 0; //其他字符出现次数

        char[] charArray = input.toCharArray();
        for(int i = 0; i < charArray.length; i++)
        {
            char ch = charArray[i];
            if('A' <= ch &&  'Z' >= ch )
            {
                countUpper++;
            }
            else if('a' <= ch && 'z' >= ch)
            {
                countLower++;
            }
            else if('0' <= ch && '9' >= ch)
            {
                countNumber++;
            }
            else
            {
                countOther++;
            }
        }
        System.out.println("大写字母有: " + countUpper + "个");
        System.out.println("小写字母有: " + countLower + "个");
        System.out.println("数字有: " + countNumber + "个");
        System.out.println("其他字符有: " + countOther + "个");
    }

}
