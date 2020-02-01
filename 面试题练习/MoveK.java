package com.HomeWork;
// 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
public class MoveK
{
        public void rotate(int[] nums, int k) {
            while(k > 0) {
                int temp = nums[nums.length-1];
                for(int i = nums.length-1;i > 0; i--) {
                    nums[i] = nums[i-1];
                }
                nums[0] = temp;
                k--;
            }

        }
}
