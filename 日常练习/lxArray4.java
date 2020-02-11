package com.HomeWork;
//对象数组的动态初始化和静态初始化
class Person
{
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void getInfo()
    {
        System.out.println("姓名: " + this.name + "年龄" + this.age);
    }
}

public class lxArray4
{
//    public static void main(String[] args)
//    {
//        Person[] person = new Person[3];//数组动态初始化
//        person[0] = new Person("斯卡蒂",17);
//        person[1] = new Person("丽芙",16);
//        person[2] = new Person("露西亚",18);
//        for(int i = 0; i < person.length; i++)
//        {
//            person[i].getInfo();
//        }
//    }

    public static void main(String[] args)
    {
        //静态初始化
        Person [] person = new Person[] {
                new Person("sikadi",17),
                new Person("lifu",16),
                new Person("luxiya",18)
                                         };
      for(int i = 0; i < person.length;i++)
      {
          person[i].getInfo();
      }
    }

}

