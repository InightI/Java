package com.HomeWork;
//删除排序数组中的重复项
public class removeArrayDuplicates
{

    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int i = 0;
        int j = 1;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }
        return i + 1;
    }


}
