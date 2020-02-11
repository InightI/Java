package com.HomeWork;
//用this调用构造函数
public class lxIt1
{
    public static void main(String[] args)
    {
        Person1 per1 = new Person1();
        Person1 per2 = new Person1("斯卡蒂");
        Person1 per3 = new Person1("丽芙",18);
        System.out.println(per1.getPersonInfo());
        System.out.println(per2.getPersonInfo());
        System.out.println(per3.getPersonInfo());
    }
}

class Person1
{
    private String name;
    private int age;

    public Person1()
    {
        System.out.println("产生一个新的Person1对象");
    }

    public Person1(String name)
    {
       this(); //等同于19行到22行 即调用本类无参构造函数
        this.name = name;
    }

    public Person1(String name, int age)
    {

        this(name);
        this.age = age;//调用本类有参构造函数
    }
    public String getPersonInfo()
    {
        return "姓名" + name + ",年龄" + age;
    }
}
