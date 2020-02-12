package com.codelx1;
//代理模式模拟购买产品

interface ISubject
{
    public void buyGame();//核心功能买游戏
}

class RealSubject implements ISubject
{
    public void buyGame()
    {
        System.out.println("买一份黑魂");
    }
}

class ProxySubject implements ISubject
{
    private ISubject subject;//真正的操作业务
    public ProxySubject(ISubject subject)
    {
        this.subject = subject;
    }
    public void produceGame()
    {
        System.out.println("生产黑魂");
    }
    public void afterSale()
    {
        System.out.println("黑魂售后");
    }
    public void buyGame()
    {
        this.produceGame(); //真实购买前的准备
        this.subject.buyGame();//调用真实业务
        this.afterSale();//操作后的收尾
    }
}

class Factory
{
    public static ISubject getInstence()
    {
        return new ProxySubject(new RealSubject());
    }

}
public class ProxyDesign
{
    public static void main(String[] args)
    {
        ISubject subject = Factory.getInstence();
        subject.buyGame();
    }
}
