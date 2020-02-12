package com.HomeWork;
//用this表示当前对象
//只要对象调用了本类中的方法,this就能表示当前执行的对象
public class lxThis
{
    public static void main(String[] args)
    {
        Person2 p1 = new Person2();
        System.out.println("主方法:" + p1);
        p1.print();
        System.out.println("===========");
        Person2 p2 = new Person2();
        System.out.println("主方法:" + p2);
        p2.print();


    }
}

class Person2
{
    public void print()
    {
        System.out.println("打印方法" + this);
    }
}


