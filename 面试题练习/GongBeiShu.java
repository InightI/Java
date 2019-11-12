package com.lx20191112;
import java.util.*;
public class GongBeiShu
{
    public static int MinCount(int a, int b)
    {


        if(a == b)
        {
            System.out.println(b);
        }
        int m = a % b;
        while(m != 0)
        {
            a = b;
            b = m;
            m = a % b;
        }
        return b;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mod = MinCount(a,b);
        int result = a * b / mod;
        System.out.println(result);

    }


}
