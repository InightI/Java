package interviewWork;
//前序遍历
import java.util.*;
public class PreorderTraversal
{
    //递归
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root)
    {

        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
        {
            return list;
        }

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    //迭代
    public List<Integer> preorderTraversal2(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty())
        {
            if(root != null)
            {
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            else
            {
                root = stack.pop();
                root = root.right;
            }
        }
        return list;

    }

}



