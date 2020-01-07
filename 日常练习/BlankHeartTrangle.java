package com.HomeWork;
import java.util.Scanner;
public class BlankHeartTrangle
{
    public static void main(String[] args) {


        System.out.println("输入要打印的行数:");
        Scanner Scanner = new Scanner(System.in);
        int lay = Scanner.nextInt();
        if (lay <=2 || lay > 50) {// 行数范围3-50，空心效果3行以上

            System.out.println("输入有误!");
            System.exit(0);
        }
        System.out.println("图形效果如下:");


        for (int i = 1; i <= lay; i++)// 控制打印的行数
        {
            for (int a = 0; a < lay - i; a++) {
                System.out.print(" ");// 打印空格


            }
            for (int b = 1; b <= i * 2 - 1; b++) {
                if (i == 1 || i == lay)// 判断是否是第一或最后一行
                {
                    System.out.print("*");
                } else {
                    if (b == 1 || b == i * 2 - 1)// 判断是否是本行第一个或最后一个字符


                    {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }


                }
            }
            System.out.println();// 输出回车
        }
    }
}



