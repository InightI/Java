package com.HomeWork;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] array = {8,4,56,32,16,66,99,45};
        quickSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int [] arr, int left,int right)
    {
        int l = left;//左下标；
        int r = right;//右下标
        int pivot = arr[(left + right) / 2];//pivot 表示中轴
        int temp = 0;
        //while循环的目的是让比pivot值小的放到左边
        //比pivot值大的放到右边
        while(l < r)
        {
            //在pivot的左边一直找，找到大于等于pivot的值，才退出
            while(arr[l] < pivot)
            {
                l += 1; //表示左下标向中轴走，直到大于等于pivot值才停止
            }
            while(arr[r] > pivot)
            {
                r -= 1;//表示右下标向中轴走，直到小于等于pivot值才停止
            }
            //如果 l >= r，说明pivot的值已经是 左边全是大于中轴，右边全是小于中轴
            if(l >= r)
            {
                break;
            }
            //交换l 和r 的值
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现这个arr[l] 等于 pivot的值，r--
            if(arr[l] == pivot)
            {
                r -= 1;
            }
            if(arr[r] == pivot)
            {
                l += 1;
            }
        }
        if(l == r) //必须移动，否则会出现栈溢出
        {
            l += 1;
            r -= 1;
        }
        //向左递归
        if(left < r)
        {
            quickSort(arr,left,r);
        }
        //向右递归
        if(right > l)
        {
            quickSort(arr,l,right);
        }
    }
}
