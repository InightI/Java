package com.lx20191115;
//输入n,求n!后有多少个零
import java.util.*;
public class JieCheng
{


     public static int fun1(int n)
    {
        int num = 0;
        int i,j;

        for (i = 5;i <= n;i += 5)
        {
            j = i;
            while (j % 5 == 0)
            {
                num++;
                j /= 5;
            }
        }
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        fun1(N);

    }
}
