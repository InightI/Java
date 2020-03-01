package com.codelx1;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int [] arr = new int [15];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100); //生成0-100的随机数放入数组
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length); //调用归并排序算法
       System.out.println(Arrays.toString(arr));

    }

    //将排序好的数组最小区间开始合并
    public static void partiton(int [] arr, int left, int mid, int right)
    {
        int length = right - left; //临时数组的长度
        int temp[] = new int [length];//需要一个临时数组
        int l = left;//待放入数组的最左索引
        int m = mid;//中间索引,可以看成两个区间并在一块,中间索引是另一个区间的最左索引
        int t = 0;//临时数组的最左索引,从0开始

        //第一步 先把排好序的两边数组放到临时数组中
        while(l < mid && m < right) //确保索引正常
        {
            if(arr[l] <= arr[m])//如果待放入数组的左索引的值小于等于中间索引的值
            {
                temp[t] = arr[l]; //将较小的元素先放进临时数组中
                l++;//两边索引后移一位
                t++;
            }
            else
            {
                temp[t] = arr[m];//否则就是另一边区间的数放入临时数组
                m++;
                t++;

            }
        }

        //第二步,如果一边数组已经放完,则另一边数组的元素则依次放到临时数组中
        while(l < mid)
        {
            temp[t] = arr[l];//较小的数先放入临时数组
            l++;
            t++;
            //t+=1;
            //left+=1;
        }
        while(m < right)
        {
            temp[t] = arr[m];
            m++;
            t++;
            //t+=1;
           // j+=1;
        }

        //第三步,再将临时数组的元素返回到原本数组中
       for(t = 0; t < length; t++)
        {
            arr[left] = temp[t];
            left++;//t索引已经循环自增过了
        }
    }
    //将数组的元素递归拆分为最小区间
    public static void mergeSort(int arr[], int left, int right)
    {
        if(left + 1 >= right)
        {
            return;
        }
        int mid = (right + left) / 2;//中间索引
        mergeSort(arr,left,mid); //拆分左区间
        mergeSort(arr,mid, right);//拆分右区间
        partiton(arr,left,mid,right);
    }
}


