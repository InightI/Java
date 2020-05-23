package com.HomeWork;
//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树
public class SortedArrayToBST
{
    public  TreeNode SortedArrayToBst(int nums[])
    {
        return SortedArrayToBst(nums, 0, nums.length - 1);
    }

    public TreeNode SortedArrayToBst(int nums[], int left, int right)
    {
        if(right < left)
        {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode (nums[mid]);
        root.left = SortedArrayToBst(nums, left, mid - 1);
        root.right = SortedArrayToBst(nums, mid + 1, right);
        return root;
    }

}

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val)
    {
        this.val = val;
    }
}