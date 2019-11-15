package com.lx20191114;
import java.util.*;
public class GapArray {


    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (k > input.length) {
            return al;
        }

        //循环k次   list中添加k个元素
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {

                //寻找最小元素，防止数组末尾
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            //将最小的元素值添加list中去
            al.add(input[input.length - i - 1]);
        }
        return al;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int k = sc.nextInt();
        int[] a = {1,2,3,6,7,9,0,8};

        ArrayList<Integer> list = GetLeastNumbers_Solution(a, k);
        System.out.println(list);

    }
}
