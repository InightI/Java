package com.codelx1;
//普通子类继承抽象父类
public class Abstractlx
{
    public static void main(String[] args)
    {
        Person person = new Student();//实例化子类，向上转型
        person.getPersonInfo();

    }
}

abstract class Person
{
    private String name;
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public abstract void getPersonInfo();//抽象方法
}

class Student extends Person
{
    public void getPersonInfo()
    {
        System.out.println("sikadi");
    }
}
