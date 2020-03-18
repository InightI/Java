package com.codelx1;

public class CircleLinckedListDemo
{
    public static void main(String[] args)
    {
        CircleSingleLinkedList boy1 = new CircleSingleLinkedList();

        boy1.addBoy(6);
        boy1.showBoy();
        boy1.countBoy(3,2,6);
    }
}

class CircleSingleLinkedList
{
    private Boy first = null;
    public void addBoy(int nums)
    {
        if(nums < 1)
        {
            System.out.println("nums的值不正确");
            return;
        }
        Boy curBoy = null;
        for(int i = 1; i <= nums; i++)
        {
            Boy newBoy = new Boy(i);
            if(i == 1)
            {
                first = newBoy;
                first.setNext(first);
                curBoy = first;
            }
            else
            {
                curBoy.setNext(newBoy); //newBoy 是后面进来的默认最后面
                newBoy.setNext(first);
                curBoy = newBoy;//temp指针后移
            }
        }
    }

    public void showBoy()
    {
        if(first == null)
        {
            System.out.println("没有任何小孩");
            return;
        }
        Boy curBoy = first;
        while(true)
        {
            System.out.println("当前小孩的编号：" + curBoy.getNumber());
            if(curBoy.getNext() == first)
            {
                break;
            }
            curBoy = curBoy.getNext();
        }
    }
    //startNum 表示第几个小孩开始数，countNum 表示数加下，nums 表示最初有多少个小孩在圈中
    public void countBoy(int startNum,int countNum,int nums)
    {
        if(first == null || startNum < 1 || startNum > nums)
        {
            System.out.printf("输入的数据有错");
            return;
        }
        Boy helper = first;
        while(true)
        {
            if(helper.getNext() == first)
            {
                break;
            }
            helper = helper.getNext();
        }
        for(int j = 0; j < startNum - 1; j++)
        {
            first = first.getNext();
            helper = helper.getNext();
        }
        while(true)
        {
            if(helper == first)
            {
                break;
            }
            for(int j = 0; j < countNum - 1; j++)
            {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println("小孩 " + first.getNumber() + " 出圈了");
            first = first.getNext();
            helper.setNext(first);
        }
    }
}

class Boy
{
    private int number;
    private Boy next;

    public Boy(int number)
    {
        this.number = number;
    }
    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public Boy getNext()
    {
        return next;
    }

    public void setNext(Boy next)
    {
        this.next = next;
    }
}