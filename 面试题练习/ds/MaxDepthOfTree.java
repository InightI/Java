package com.HomeWork;

public class MaxDepthOfTree
{
    public class TreeNode
    {
     int val;
    TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
}

    class Solution {
        public int maxDepth(TreeNode root) {
            if(root == null)
            {
                return 0;
            }


            else
            {
                int leftD = maxDepth(root.left);
                int rightD = maxDepth(root.right);
                return java.lang.Math.max(leftD,rightD) + 1;
            }
        }
    }
}
