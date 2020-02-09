package com.HomeWork;

import java.util.Arrays;

//数组拷贝
public class lxArray2
{
    public static void main(String[] args)
    {
        int []dataA = new int [] {1,2,3,4,5};
        int []dataB = new int [] {11,12,13,45,56};//从0开始数,第三个位置开始拷贝,考到目标数组第二个位置,考两个数
        System.arraycopy(dataB,2,dataA,1,2);
        printArray(dataA);
    }
    public static void printArray(int [] temp)
    {
        for(int i = 0; i < temp.length; i++)
        {
            System.out.println(temp[i]);
        }
    }
//    public static void main(String[] args)
//    {
//        int [] origin = new int [] {1,3,5,7,9};
//        int [] result = Arrays.copyOf(origin,10); //使原数组长度加长到10
//        for(int temp: result)
//        {
//            System.out.println(temp);
//        }
//    }
}
