package com.codelx1;

import java.util.Arrays;

public class shell1
{
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random() * 66);
        }
        System.out.println(Arrays.toString(arr));
        //shell(arr);
        //Bubble(arr);
        //select(arr);
        //insert(arr);
        merge(arr,0,arr.length - 1);
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void shell(int arr[])
    {
        for(int gap = arr.length / 2; gap > 0; gap /= 2)
        {
            for(int i = gap; i < arr.length; i++)
            {
                for(int j = i - gap; j >= 0; j -=gap)
                {
                    if(arr[j] > arr[j + gap])
                    {
                        swap(arr,j,j + gap);
                    }
                }
            }
        }
    }

    public static void Bubble(int arr[])
    {
        for(int i = 0; i <arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    swap(arr, j , j + 1);
                }
            }
        }
    }

    public static void select(int arr[])
    {
        for(int i = 0; i <arr.length; i++)
        {
            int min = arr[i];
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void insert(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i - 1] > arr[i])
            {
                for(int j = 0; j <= i - 1 ; j++)
                {
                    if(arr[j] > arr[i])
                    {
                        int t = arr[i];
                        for(int k = i - 1; k >= j; k--)
                        {
                            arr[k + 1] = arr[k];
                        }
                        arr[j] = t;
                    }
                }
            }
        }
    }

    public static int []quickSort(int arr[], int first, int last)
    {
       if(first < last)
       {
           int pivotIndex = partition(arr,first,last);
           quickSort(arr,first,pivotIndex - 1);
           quickSort(arr,pivotIndex + 1, last);
       }
       return arr;
    }
    //①
    public static int partition(int arr[], int left, int right)
    {
        int pivot = arr[left];
        int l = left;
        int r = right;

        while(l< r)
        {
            while(l < r && arr[r] >= pivot)
            {
                r--;
            }
            while(l < r && arr[l] <= pivot)
            {
                l++;
            }
            if(l < r)
            {
                swap(arr,l ,r);
            }
        }

            arr[left] = arr[r];
            arr[r] = pivot;
        return r;

    }

    public static void merge(int arr[], int left,int right)
    {
        if(left + 1 >= right)
        {
            return;
        }
        int mid = (left + right) / 2;
        merge(arr,left,mid);
        merge(arr,mid,right);
        mergePart(arr,left,mid,right);
    }
    public static void mergePart(int arr[], int left, int mid, int right)
    {
        int length = right - left;
        int temp[] = new int[length];
        int l = left;
        int m = mid;
        int t = 0;

        while(l < mid && m < right)
        {
            if(arr[l] <= arr[m])
            {
                temp[t] = arr[l];
                l++;
                t++;
            }
            else
            {
                temp[t] = arr[m];
                t++;
                m++;
            }
        }

        while(l < mid)
        {
            temp[t] = arr[l];
            t++;
            l++;
        }
        while(m < right)
        {
            temp[t] = arr[m];
            t++;
            m++;
        }

        for(int i = 0; i < length; i++)
        {
            arr[left] = temp[i];
            left++;
        }
    }

    public static void swap(int arr[], int i,int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


}
