package com.lx20191128;
/*
生兔子问题,每三个月生个兔子
 */
import java.util.Scanner;

public class Rabbit1
{

    public static void NoRCount()//非递归计算
    {
        int amount; //每个月的兔子总数

        int nAmount = 1; //第一个月的兔子数量

        int oAmount = 1; //第二个月的兔子数量

        for(int i=1;i<=2;i++){

            amount=1;

            System.out.println("第" + i + "个月的兔子总是为：" + amount);

        }


        for(int i=3;i<=12; i++) {

            amount = oAmount + nAmount;

            oAmount = nAmount;

            nAmount = amount;

            System.out.println("第" + i + "个月的兔子总是为：" + amount);

        }

    }

    public static int RCount(int n)//递归计算
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }
        else
        {
            return RCount(n - 1) + RCount(n -2);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("请输入月份");
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int n = in.nextInt();
            System.out.println(RCount(n));
        }

    }

}
