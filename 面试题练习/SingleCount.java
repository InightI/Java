package com.lx20191116;
import java.util.*;

/**
 * 统计个位数有几个
 */

public class SingleCount
{
    public static void SingleCount1()
    {
        Scanner in = new Scanner(System.in);
        char[] ch = new char[1000];
        int[] sum = new int[10];
        ch = in.nextLine().toCharArray();
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == '0') sum[0]++;
            if(ch[i] == '1') sum[1]++;
            if(ch[i] == '2') sum[2]++;
            if(ch[i] == '3') sum[3]++;
            if(ch[i] == '4') sum[4]++;
            if(ch[i] == '5') sum[5]++;
            if(ch[i] == '6') sum[6]++;
            if(ch[i] == '7') sum[7]++;
            if(ch[i] == '8') sum[8]++;
            if(ch[i] == '9') sum[9]++;
        }
        for(int j = 0; j < 10; j++)
        {
            if(sum[j] != 0)
            {
                System.out.printf("%d:%d",j,sum[j]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        SingleCount1();

    }

}
