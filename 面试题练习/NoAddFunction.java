package com.lx20191121;

import java.util.Scanner;

/*
 不使用+或其他运算符进行相加操作,这里使用位运算
 */
public class NoAddFunction
{

    public int addAB(int A, int B)
    {
        if(B == 0)
            return A;
        int C = A ^ B;
        int carry = (A & B) << 1;
        return addAB(C,carry);
    }

    public static void main(String[] args)
    {
        NoAddFunction a = new  NoAddFunction();
        int A = 0;
        int B = 0;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        a.addAB(A,B);
        System.out.println(a.addAB(A,B));


    }


}
