package com.HomeWork;

import java.util.HashMap;
import java.util.Scanner;

//计算每个字符的出现次数
public class CountChars
{
    public static void main(String[] args)
    {
        //1.获取输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.创建Map集合,key: 字符  value: 字符个数
        HashMap<Character,Integer> map = new HashMap<>();

        //3.遍历字符串,获取每一个字符
        for(char c : str.toCharArray())
        {
            if(map.containsKey(c))
            {
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }
            else
            {
                //key 不存在
                map.put(c,1);
            }
        }
        for(Character key : map.keySet())
        {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

    }
}
