package com.lx20191120;
import java.util.*;
/*
    输入一些数字,使之组成最小数字
 */
public class MakeMinNumber
{

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (in.hasNextInt()) {
                int[] nums = new int[10];
                for(int i = 0;i<10;i++){
                    nums[i] = in.nextInt();
                }
                System.out.println(GetNum(nums));
            }
        }
        public static String GetNum( int[] nums){
            String s = "";
            for(int i = 1; i<10;i++){
                if(nums[i] != 0){
                    s += i;
                    nums[i] --;
                    break;
                }
            }
            for(int i = 0;i<10;i++){
                while(nums[i] != 0){
                    s += i;
                    nums[i] --;
                }
            }
            return s;
        }

}
