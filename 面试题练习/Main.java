package com.lx20191110;
import java.util.*;
public class Main
{
    public static void Count()
    {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
        int v4 = sc.nextInt();

        int a = 0;
        int b = 0;
        int b2 = 0;
        int c = 0;

        a = (v1 + v3) / 2;
        b = (v2 + v4) / 2;
        b2 = (v3 - v1) /2;
        c = (v4 - v2) / 2;

        v1 = a - b;
        v2 = b - c;
        v3 = a + b;
        v4 = b + c;

        if(b == b2)
        {
            System.out.printf("%d,%d,%d",a,b,c);
        }
        else
        {
            System.out.println("No");
        }

    }



    public static void main(String[] args)
    {
        Count();
    }

}
