package interviewWork;

public class TreeToDBLinkedLIst
{
    private TreeNode pre = null;
    private TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree)
    {
        convert(pRootOfTree);
        return head;
    }

    public void convert(TreeNode cur)
    {
        if (cur == null) return;
        convert(cur.left); //递归完左子树
        if (head == null)
        {
            head = cur;
            pre = cur;
        }
        else
        {
            pre.right = cur;    // pre指左子树最大的值,右指针连接根 cur是根
            cur.left = pre;     //根 的左指针连接 pre
            pre = cur;          //  pre移到根上
        }
        convert(cur.right); //递归右子树
    }


}
