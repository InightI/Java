package com.codelx1;

import java.util.Arrays;

public class MergeSort2
{
    public static void main(String args[])
    {
        int arr[] = new int [15];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        merge(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int arr[], int first, int last)
    {
        int mid = (first + last) / 2;
        if(first < last)
        {
            merge(arr,first,mid);
            merge(arr,mid + 1,last);
            mergePart(arr,first,mid,last);
        }

    }

    public static void mergePart(int arr[], int left, int mid, int right)
    {
        int temp[] = new int [right - left + 1];
        int p1 = left;
        int p2 = mid + 1;
        int t = 0;

        while(p1 <= mid && p2 <= right)
        {
            if(arr[p1] <= arr[p2])
            {
                temp[t++] = arr[p1++];
            }
            else
            {
                temp[t++] = arr[p2++];
            }
        }
        while(p1 <= mid)
        {
            temp[t++] = arr[p1++];
        }
        while(p2 <= right)
        {
            temp[t++] = arr[p2++];
        }
        for(int i = 0; i < temp.length; i++)
        {
            arr[left++] = temp[i];
        }
    }
}
