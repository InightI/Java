package com.HomeWork;

import java.util.ArrayList;
import java.util.List;

//二分查找优化,找到相同值都打印出来
public class BinarySearchDemo2
{
    public static void main(String[] args)
    {
        int arr[] = {2,3,4,66,66,66,66,77,88,99};
        ArrayList<Integer> resIndexList = binarySearch(arr,0, arr.length - 1, 66);
        System.out.println(resIndexList);
    }


    /*
    1.找到 mid 索引值,不要马上返回
    2. 向mid左,右边扫描,满足findVal的元素下标,加入集合
    3.将集合返回
     */
    public static ArrayList<Integer> binarySearch(int arr[], int left, int right, int findVal)
    {
        ArrayList<Integer> resIndexList =  new ArrayList<>();
        if(left > right) //如果递归完没找到
        {
            return  new ArrayList<Integer>(); //返回空的集合
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];

        if(findVal > midVal) //说明要找的值在右边
        {
            binarySearch(arr, mid + 1, right, findVal);
        }
        else if(findVal < midVal) // 说明要找的值在左边
        {
            binarySearch(arr, left, mid - 1, findVal);
        }

        else
        {
            //向左找
            int temp = mid - 1;
            while(true)
            {
                if(temp < 0 || arr[temp] != findVal) //如果没找到
                {
                    break; //退出
                }
                //否则就加入集合
                resIndexList.add(temp);
                temp--; //temp左移
            }

            resIndexList.add(mid);

            //向右找
            temp = mid + 1;
            while(true)
            {
                if(temp > arr.length - 1 || arr[temp] != findVal)
                {
                    break;
                }
                resIndexList.add(temp);
                temp++;
            }

        }
        return resIndexList;
    }
}
