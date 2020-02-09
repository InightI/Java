package com.HomeWork;

public class lxArray
{
    //方法接收,返回,修改 数组
    public static void main(String[] args)
    {
        int [] data = init();
        bigger(data);
        printArray(data);
    }
    //返回数组的方法
    public static int[] init()
    {
        return new int[] {1,2,3,4,5}; //匿名数组
    }
    //打印数组的方法
    public static void printArray(int[] temp)
    {
        for(int i = 0; i < temp.length; i++)
        {
            System.out.println(temp[i]);
        }
    }
    //修改数组的方法
    public static void bigger(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] *= 6; //每个元素扩大六倍
        }
    }


}
