package com.lx20191124;
import java.util.*;
/*
输入DNA字符串和所要输出的长度数字,找出现CG最多的字符串
 */
public class DNAQueue
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        int len = in.nextInt();
        int sumLen = str1.length();
        int [] count = new int[sumLen - len];
        int max = 0;
        for(int i = 0; i < sumLen - len; i++)
        {
            String subStr = str1.substring(i, i + len);
            for(int j = 0; j < len; j++)
            {
                if(subStr.charAt(j) == 'C' || subStr.charAt(j) == 'G')
                {
                    count[i]++;
                }
            }
            if(count[max] < count[i])
            {
                max = i;
            }
        }
        String result = str1.substring(max,max + len);
        System.out.println(result);

    }
}
