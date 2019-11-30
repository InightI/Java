package com.lx20191115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 输入n个整数，输出出现次数大于等于数组长度一半的数
 */
public class HalfArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String str = in.nextLine();
            String [] strs = str.split(" ");
            int [] arr = new int [strs.length];
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = Integer.valueOf(strs[i]);
            }
            int num = arr[0];
            int count = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == num)
                {
                    count++;
                }
                else if(count > 0)
                {
                    count--;
                }
                num = arr[j];
            }
            System.out.println(num);
        }
    }
}
