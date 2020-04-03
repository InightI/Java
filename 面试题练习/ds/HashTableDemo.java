package ds.hashTable;

import java.util.Scanner;

public class HashTableDemo
{
    public static void main(String[] args)
    {
        Hash_Table hash_table = new Hash_Table(7);

        //简单菜单
        String key = "";
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("add: 添加雇员");
            System.out.println("list: 显示雇员");
            System.out.println("find: 查找雇员");
            System.out.println("exit: 退出系统");

            key = sc.next();
            switch (key)
            {
                case "add" :
                    System.out.println("输入id");
                    int id = sc.nextInt();
                    System.out.println("输入名字");
                    String name = sc.next();
                    //创建雇员
                    Emp emp = new Emp(id,name);
                    hash_table.add(emp);
                    break;
                case "list" :
                    hash_table.list();
                    break;
                case "find" :
                    System.out.println("请输入要查找的id");
                    id = sc.nextInt();
                    hash_table.findEmpById(id);
                    break;
                case "exit" :
                    sc.close();;
                    System.exit(0);
                    default:
                        break;
            }
        }
    }
}

//创建HashTable 管理多条链表
class Hash_Table
{
    private EmpLinkedList[] empLinkedListArray;
    private int size; //链表个数

    //构造器
    public Hash_Table(int size)
    {
        this.size = size;
        empLinkedListArray = new EmpLinkedList[size];

        for(int i = 0; i < size; i++)
        {
            empLinkedListArray[i] = new EmpLinkedList();
        }

    }

    //添加雇员
    public void add(Emp emp)
    {
        //根据员工id来添加到哪条链表
        int empLinkedListNum = hashFun(emp.id);
        //将emp添加到链表
        empLinkedListArray[empLinkedListNum].add(emp);
    }

    //遍历所有的链表,遍历Hash_Table
    public void list()
    {
        for(int i = 0; i < size; i++)
        {
            empLinkedListArray[i].list(i);
        }
    }

    //搜索雇员id
    public void findEmpById(int id)
    {
        //使用散列函数确定哪条链表
        int empLinkedListNum = hashFun(id);
        Emp emp = empLinkedListArray[empLinkedListNum].findEmpById(id);
        if(emp != null)
        {
            System.out.printf("在第%d条链表中找到 雇员 id = %d, name = %s\n", (empLinkedListNum+1), id, emp.name);
        }
        else
        {
            System.out.println("在哈希表在没有找到");
        }
    }



    //编写散列函数,使用简单取模法
    public int hashFun(int id)
    {
        return id % size;
    }
}

class Emp //表示一个雇员
{
    public int id;
    public String name;
    public Emp next;//默认为空

    public Emp(int id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }
}

class EmpLinkedList  //表示链表
{
    private Emp head; //头指针,直接指向第一个Emp

    //添加雇员到链表,id从小到大自增长,直接尾插到链表最后
    public void add(Emp emp)
    {
        //如果添加第一位雇员
        if(head == null)
        {
            head = emp;
            return;
        }

        //如果不是,使用辅助指针遍历
        Emp curEmp = head;
        while(true)
        {
            if(curEmp.next == null)//如果以遍历到最后
            {
                break;
            }
            curEmp = curEmp.next;//否则指针后移
        }

        //退出循环时已是末尾,直接尾插
        curEmp.next = emp;
    }

    //遍历链表雇员的信息
    public void list(int num)
    {
        if(head == null)
        {
            System.out.println("第" + (num+1) + "条链表为空");
            return;
        }
        System.out.println("第" + (num+1) +"条链表信息为");
        Emp curEmp = head; //辅助指针
        while(true)
        {
            System.out.printf(" => id=%d name=%s\t", curEmp.id, curEmp.name);
            if(curEmp.next == null)//如果已经走到末尾
            {
                break;
            }
            curEmp = curEmp.next;//后移
        }
        System.out.println();
    }

    //根据id 查找雇员,如果查找到就返回该雇员,没找到就返回null
    public Emp findEmpById(int id)
    {
        //判断链表是否为空
        if(head == null)
        {
            System.out.println("链表为空");
            return null;
        }

        Emp curEmp = head;
        while(true)
        {
            if(curEmp.id == id)
            {
                break;//已找到
            }
            if(curEmp.next == null) //说明已到末尾
            {
                curEmp = null;
                break;
            }
            curEmp = curEmp.next;
        }
        return curEmp;
    }







}
