package com.codelx1;

import java.util.Scanner;

public class CuntNumber
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) //以便一直输入
        {
            String str = sc.nextLine();
            //max是记录最长的数字串,count变化的计数器,end记录数字串的末尾
            int max = 0, count = 0, end = 0;
            for(int i = 0; i < str.length(); i++) //把字符串从头检索
            {
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
                {
                    count++;
                    if(max < count) //有了更长的数字串就赋值给max
                    {
                        max = count;
                        end = i; //获取数字串的结尾位置
                    }
                }
                else
                {
                    count = 0;
                }
            }
            System.out.println(str.substring(end - max + 1,end + 1));
        }
    }
}
