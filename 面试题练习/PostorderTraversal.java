package interviewWork;
//后序遍历
import java.util.*;
public class PostorderTraversal
{
    //使用两个栈,将前序遍历逆序过来
    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack1.push(root);
        while( !stack1.isEmpty())
        {

            TreeNode temp = stack1.pop();
            if(temp != null)
            {
                stack2.push(temp.val);
                stack1.push(temp.left);
                stack1.push(temp.right);
            }
        }
        while(!stack2.isEmpty())
        {
            list.add(stack2.pop());
        }
        return list;
    }

    //迭代
    public List<Integer> postorderTraversal2(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
        {
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop();
            if(temp.left != null)
            {
                stack.push(temp.left);
            }
            if(temp.right != null)
            {
                stack.push(temp.right);
            }
            list.add(0,temp.val);
        }
        return list;
    }
}
