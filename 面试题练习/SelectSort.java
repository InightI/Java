package com.codelx1;

import java.util.Arrays;

public class SelectSort
{
    public static void main(String[] args)
    {
        int [] array = new int [10];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 666);
        }
        System.out.println("排序前");
        System.out.println(Arrays.toString(array));
        System.out.println("排序后");
        selectSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void selectSort(int arr[])
    {

        for(int i = 0; i < arr.length - 1; i++)
        {
            int minIndex = i; //设置最开始的i下标是第一个下标
            int min = arr[i]; //假设第一个下标指向的是最小元素
            for(int j = i + 1; j < arr.length; j++) // 长度不用减一
            {
                if(min > arr[j]) //内循环里比较的元素是j下标指向的元素
                {                   // 如果min变量里元素不是最小,就交换成最小
                    min = arr[j];
                    minIndex = j;  //包括下标一起交换
                }
            }
            if(minIndex != i)   //将一轮循环后的最小值与最开始的0号位置下标指向的值交换
            {
                arr[minIndex] = arr[i];//比如第一轮后, 一开始的3下标位置就必然是最小值
                arr[i] = min;
            }                 //[101,45,43,2] 第一轮,minIndex是3, 现在要把3这个位置的最小值放到0号位置
        }                    //,就是第一个位置 arr[3] = arr[0]; arr[0] = 2;
    }                       //将101 放到 2 这个位置,101这个位置就空了,由最小值补上,最小值就是2
}
