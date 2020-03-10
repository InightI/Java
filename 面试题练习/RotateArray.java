package com.HomeWork;

public class RotateArray
{
    class Solution {
        public void rotate(int[] nums, int k)
        {
            k %= nums.length;
            reverse(nums,0,nums.length - 1);
            reverse(nums,0,k - 1);
            reverse(nums,k,nums.length - 1);

        }

        public void reverse(int arr[] ,int left, int right)
        {
            int temp;
            while(left < right)
            {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
