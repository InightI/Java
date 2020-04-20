package ds.tree;
//二叉树前中后序遍历
class Node
{
    private int num;
    private String name;
    private Node left; //默认null
    private Node right; //默认null

    public Node(int num, String name)
    {
        this.num = num;
        this.name = name;
    }

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Node getLeft()
    {
        return left;
    }

    public void setLeft(Node left)
    {
        this.left = left;
    }

    public Node getRight()
    {
        return right;
    }

    public void setRight(Node right)
    {
        this.right = right;
    }

    @Override
    public String toString()
    {
        return "Node{" + "num=" + num + ", name='" + name + '\'' + '}';
    }

    //前序遍历
    public void preOrder()
    {
        System.out.println(this); //先输出父节点
        //向左子树递归前序遍历
        if(this.left != null)
        {
            this.left.preOrder();
        }
        //向右子树递归前序遍历
        if(this.right != null)
        {
            this.right.preOrder();
        }
    }

    //中序遍历
    public void midOrder()
    {
        //左子树
        if(this.left != null)
        {
            this.left.midOrder();
        }

        //父节点
        System.out.println(this);

        //右子树
        if(this.right != null)
        {
            this.right.midOrder();
        }
    }

    //后序遍历
    public void postOrder()
    {
        //左子树
        if(this.left != null)
        {
            this.left.postOrder();
        }

        //右子树
        if(this.right != null)
        {
            this.right.postOrder();
        }

        //父节点
        System.out.println(this);
    }
}

//定义一个二叉树
class Binary_Tree
{
    private Node root;

    public void setRoot(Node root)
    {
        this.root = root;
    }

    //前序遍历
    public void preOrder()
    {
        if(this.root != null)
        {
            this.root.preOrder();
        }
        else
        {
            System.out.println("二叉树为空");
        }
    }

    //中序遍历
    public void midOrder()
    {
        if(this.root != null)
        {
            this.root.midOrder();
        }
        else
        {
            System.out.println("二叉树为空");
        }
    }

    //后序遍历
    public void postOrder()
    {
        if(this.root != null)
        {
            this.root.postOrder();
        }
        else
        {
            System.out.println("二叉树为空");
        }
    }
}

public class BinaryTree
{
    public static void main(String[] args)
    {
        Binary_Tree binaryTree = new Binary_Tree();
        Node root = new Node (1,"深红");
        Node node2 = new Node (2,"红莲");
        Node node3 = new Node (3,"真理");
        Node node4 = new Node (4,"仰光");
        Node node5 = new Node (5, "苏菲亚");

        //手动创建二叉树
        root.setLeft(node2);
        root.setRight(node3);
        node3.setLeft(node4);
        node3.setRight(node5);
        binaryTree.setRoot(root);

        System.out.println("前序遍历");
        binaryTree.preOrder();
        System.out.println("=================");
        System.out.println("中序遍历");
        binaryTree.midOrder();
        System.out.println("=================");
        System.out.println("后序遍历");
        binaryTree.postOrder();

    }



}

