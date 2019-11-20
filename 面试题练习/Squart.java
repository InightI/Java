package com.lx20191120;
import java.util.*;

/**
 * 输入一个整数数字和一个字符 自动生成正方形
 */
public class Squart
{
    public static void Squart1()
    {
        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
        String c = in.next();
        int row = col / 2;
        if(col % 2 != 0)
        {
            row = col / 2 + 1;
        }

        for(int i = 0; i < col; i++)
        {
            System.out.print(c);
        }
        System.out.println();
       for(int i = 0; i < row - 2; i++)
       {
           System.out.print(c);
           for(int j = 0; j < col - 2; j++)
           {
               System.out.print(" ");
           }
           System.out.print(c);
           System.out.println();
       }
       for(int i = 0; i < col; i++)
       {
           System.out.print(c);
       }




    }

    public static void main(String[] args)
    {

        Squart1();

    }
}
