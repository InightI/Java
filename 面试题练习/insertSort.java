package com.codelx1;

import java.util.Arrays;

public class insertSort
{
    public static void main(String[] args)
    {
        int [] arr = new int [10];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 99);
        }
        System.out.println(Arrays.toString(arr));
        insersort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insersort(int arr[])
    {
        for(int i = 1; i < arr.length; i++) //注意!!! 插入循环要留第一个数据当做有序区间,千万不能从0开始!
        {
            if(arr[i - 1] > arr[i])//因为前面是有序区间,所以只需比自己前一个数据,如果在i前面的数大于i,就执行j循环
            {
                for(int j = 0; j < i; j++)//发现异常数字后,就要开始遍历i前面所有的数,寻找合适插入环境
                {
                    if(arr[j] > arr[i]) //的确找到了j位置的比i大,就要开始插入,把大的往后挪,小的插进来
                    {                   //从左往右,j下标在i的前头
                        int temp = arr[i];//i到j位置的数据向后移动
                        for(int k = i - 1; k >= j; k--) //还是从左往右,不过是左边数大,右边终点数小
                        {
                            arr[k + 1] = arr[k];
                        }
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
