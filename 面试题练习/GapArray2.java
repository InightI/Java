package com.lx20191114;
//使用快排
import java.util.*;

public class GapArray2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] s = str.split(" ");
            int[] num = new int[s.length-1];

            for(int i = 0; i < s.length - 1; i++) {//最后一个是k值
                num[i] = Integer.parseInt(s[i]);
            }

            int k = Integer.parseInt(s[s.length-1]);//k
            int start = 0;
            int end = num.length-1;

            int index = qSort(num, start, end);

            while(index != k){
                if(index > k){
                    end = index - 1;
                    index = qSort(num, start, end);
                }else{
                    start = index + 1;
                    index = qSort(num, start, end);
                }
            }

            Arrays.sort(num, 0, k);//排序

            for(int i=0;i<k;i++){
                System.out.print(i == k-1 ? num[i] : num[i] + " ");//最后一个数后面不再需要空格
            }
        }
    }

    public static int qSort(int[] num, int start, int end){

        int par = num[start];//快排 找基准

        while(start < end){
            while(start < end && num[end] >= par) {//判断start<end不能省
                end--;
            }
            num[start] = num[end];

            while(start < end && num[start] < par) {
                start++;
            }
            num[end] = num[start];
        }
        num[start] = par;
        return start;
    }
}
