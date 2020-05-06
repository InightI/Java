package interviewWork;
//二叉树中序遍历
import java.util.*;
public class InOrderTraversal
{
    //递归
    List<Integer> list = new LinkedList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root)
    {
        if(root==null){
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
//非递归
class Solution {
    public List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty())
        {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }
}

