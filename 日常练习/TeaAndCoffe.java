package com.codelx1;

import java.util.Scanner;

//利用超类模板实现茶和咖啡类的相似工作
public class TeaAndCoffe
{
    public static void main(String[] args)
    {
        CaffeineBverage tea = new Tea();
        CaffeineBverage coffee = new Coffee();
        System.out.println("\nMaking tea.....");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee");
        coffee.prepareRecipe();
    }
}

abstract class CaffeineBverage
{
    final void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
        {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater()
    {
        System.out.println("Boilng water");
    }
    void pourInCup()
    {
        System.out.println("Pouring into cup");
    }

    /*
    *钩子方法
    * 超类中通常是默认实现，子类可以选择性的覆写此方法
    */
    boolean customerWantsCondiments()
    {
        return true;
    }
}

class Tea extends CaffeineBverage
{
    void brew()
    {
        System.out.println("Steeping the tea");
    }
    void addCondiments()
    {
        System.out.println("Adding lemon");
    }
}

class Coffee extends  CaffeineBverage
{
    void brew()
    {
        System.out.println("Dripping Coffee throngh filter");
    }
    void addCondiments()
    {
        System.out.println("Adding suger and Milk");
    }
    //子类覆写了钩子函数，实现自定义功能
    public boolean customerWantsCondiments()
    {
        String answer = getUserInput();
        if(answer.equals("y"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private String getUserInput()
    {
        String answer = null;
        System.out.println("您想要在咖啡中加入牛奶或糖吗（y/n)");
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
        return answer;
    }
}
