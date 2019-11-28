package com.lx20191115;

import java.util.Scanner;

public class ReverseC
{
    public static void Reverse1(String s)
    {
        char [] c = s.toCharArray();
        for(int i = c.length - 1; i >= 0; i--)
        {
            System.out.print(c[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        Reverse1(s);

    }
}




