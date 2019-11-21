package com.lx20191120;

/*
    利用List计算个位数
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountSingleNum
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String n = in.next();
        char[] ch = n.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            list.add(0);
        }
        for(int i = 0; i < ch.length; i++)
        {
            list.set(ch[i] - '0',list.get(ch[i] - '0') + 1);
        }
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) > 0)
            {
                System.out.println(i + ":" + list.get(i));
            }
        }

    }
}
