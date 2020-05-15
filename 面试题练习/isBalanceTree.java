package interviewWork;

public class isBalanceTree
{
    public boolean isBalancedTree(TreeNode root)
    {
        if(root == null)
        {
            return true;
        }

        int leftHeight = getTreeHeight(root.left); //左子树高度
        int rightHeight = getTreeHeight(root.right);//右子树高度

        if(Math.abs(leftHeight - rightHeight) > 1)
        {
            return false;
        }

        return isBalancedTree(root.left) && isBalancedTree(root.right);
    }

    //计算树的高度
    public static int getTreeHeight(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        return Math.max(getTreeHeight(root.left), getTreeHeight(root.right)) + 1;
    }
}
