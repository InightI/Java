package com.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo
{
    public static void main(String[] args)
    {
        int [] arr =  new int [10];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 99);
        }
        System.out.println(Arrays.toString(arr));
        quick(arr,0,arr.length - 1);
        System.out.println("排序的结果为: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("请输入要查找的数: ");

        Scanner sc =  new Scanner(System.in);
        int i = sc.nextInt();
        int resIndex = binarySearch(arr,0, arr.length - 1, i);
        System.out.println("被查找数的下标为 " + resIndex );
    }

    public static int[] quick(int arr[], int left, int right)
    {
        if(left < right)
        {
            int pivotIndex = quickPart(arr,left,right);
            quick(arr,left, pivotIndex - 1);
            quick(arr,pivotIndex + 1, right);
        }
        return arr;
    }

    public static int quickPart(int arr[], int left, int right)
    {
        int pivot = arr[left];
        int l = left;
        int r = right;

        while(l < r)
        {
            while(l < r && arr[r] >= pivot)
            {
                r--;
            }
            while(l < r && arr[l] <= pivot)
            {
                l++;
            }

            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
        }

        arr[left] = arr[r];
        arr[r] = pivot;
        return r;
    }


    public static int binarySearch(int[] arr, int left, int right, int findVal)
    {
        if(left > right) //已经递归整个数组
        {
            return -1; //如果没找到,返回-1
        }

        int mid = (right + left) / 2;
        int midVal = arr[mid];

        if(findVal > midVal)
        {
            return binarySearch(arr, mid + 1, right, findVal);
        }
        else if(findVal < midVal)
        {
            return binarySearch(arr, left, mid - 1, findVal);
        }
        else
        {
            return mid;
        }

    }
}
