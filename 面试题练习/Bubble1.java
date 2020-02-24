package com.codelx1;

public class Bubble1
{
    public static void main(String[] args)
    {
        int [] array = {4,8,2,9,7};
        Bubble(array);
        System.out.println("排序后");
        for(int i:array)
        {
            System.out.println(" " + i);
        }

    }

    public static void Bubble(int[] arr)
    {
         boolean flag = true;
         for(int i = 0; i < arr.length - 1; i++)
         {
             for(int j = 0; j < arr.length - 1 - i; j++)
             {
                 if(arr[j] > arr[j + 1])
                 {
                     swap(arr, j, j + 1);
                     flag = false; //还未排序好
                 }
             }
             if(flag) //如果已经有序
             {
                 break;
             }

         }

    }

    public static void swap(int arr1[], int a, int b)
    {
        int t = arr1[a];
        arr1[a] = arr1[b];
        arr1[b] = t;
    }

}


