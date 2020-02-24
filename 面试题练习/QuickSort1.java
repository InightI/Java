package com.codelx1;
public class QuickSort1
{
    //③
    public static void main(String[] args)
    {
        int [] arr = new int [10];
        for(int i = 0; i < arr.length - 1; i++)
        {
            arr[i] = (int)(Math.random() * 1000);
        }
        quickSort(arr,0,arr.length - 1);
        for(int i : arr)
        {
            System.out.println(" " + i);
        }
    }
//②
    public static int []quickSort(int arr[], int first, int last)
    {
        if(first < last)
        {
           int pivotIndex = partition(arr,first,last); //传入参数，得到中轴
           quickSort(arr,first,pivotIndex - 1);//分好中轴后开始左右递归
           quickSort(arr,pivotIndex + 1, last);
        }
        return  arr;
    }
    //①
    public static int partition(int arr[], int left, int right)
    {
        int pivot = arr[left];//用数组第一个元素做中轴
        int l = left;//左索引
        int r = right;//右索引

        while(l < r)
        {
            while(l < r && arr[r] >= pivot) //这里必须要右针先移动，即r--，顺序不能调换
            {
                r--;
            }
            while(l < r && arr[l] <= pivot)
            {
                l++;
            }

            int t = arr[l]; //左右俩针交换值
            arr[l] = arr[r];
            arr[r] = t;

        }
                                    //最开始左针的值拿来当中轴，挖了坑，是空的，
            arr[left] = arr[r]; //这里是循环结束后，俩针无法再走时，右针将值给左针
            arr[r] = pivot; //右针空的值由先前让出去的中轴填上
        return r; //将右针的坑填上，即将分好排序的中轴返回
//左针的值给 --》中轴，循环结束，右针的值给 --》左针空的坑，中轴填--》右针空的坑
    }
}