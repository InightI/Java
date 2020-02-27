package com.codelx1;
//希尔排序
import java.util.Arrays;

public class ShellSort
{
    public static void main(String[] args)
    {
        int [] arr = new int[15];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int [] arr)
    {
        for(int gap = arr.length / 2; gap > 0; gap /= 2) //计算出每一轮的间隔为多少
        {
            for(int i = gap; i < arr.length; i++) //长度不用减一
            {
                for(int j = i - gap; j >= 0; j -= gap) //可以看做 j 离 i 的左 gap 这么远处,
                {                                        //只要不为0,就一直以这个间隔比较两个数
                    if(arr[j] >= arr[j + gap])//两个离gap这个距离的数比较
                    {
                        swap(arr,j,j + gap);
                    }
                }
            }
        }
    }

    public static void swap(int arr[],int x,int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
