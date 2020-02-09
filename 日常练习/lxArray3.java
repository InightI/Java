package com.HomeWork;
// 从数组中找出最大值最小值和平均值
public class lxArray3
{
    public static void main(String[] args)
    {
        processData(new int[] {1,4,56,98,12,45});
    }

    public static void processData(int [] temp)
    {
        double[] result = new double[4];
        result[0] = temp[0]; //最大值
        result[1] = temp[0];//最小值
        result[2] = temp[0];//总和
        result[3] = temp[0];//平均值

        for(int i = 0; i < temp.length; i++)
        {
            result[2] += temp[i];
            if(temp[i] > result[0])
            {
                result[0] = temp[i];
            }
            if(temp[i] < result[1])
            {
                result[1] = temp[i];
            }
            result[3] = result[2] / temp.length;
        }
        System.out.println("最大值为:" + result[0]);
        System.out.println("最小值为:" + result[1]);
        System.out.println("总和为:" + result[2]);
        System.out.println("平均值为:" + result[3]);
    }

}
