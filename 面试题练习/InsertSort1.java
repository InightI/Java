package com.lx20191124;
/*
插入排序
 */
public class InsertSort1
{
    public static void main(String[] args)
    {
        int [] array = {2,3,7,1,4,8};
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < array[i - 1])
            {
                for(int j = 0; j < i; j++)
                {
                    if(array[i] < array[j])
                    {
                        int temp = array[i];
                        for(int k = i - 1; k >= j; k--)
                        {
                            array[k + 1] = array[k];
                        }
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

    }

}
