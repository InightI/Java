package com.lx20191124;
import java.util.*;
import java.math.*;
public class MoneyPay
{
    public static void main(String[] args)
    {
        double a = 0;
        System.out.print(300+ " ");
        for(int i = 1; i <= 30; i++)
        {
            a = a + Math.pow(2,i - 1);
        }
        System.out.println((int)a);

    }
}
