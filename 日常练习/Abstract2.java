package com.codelx1;
//子类同时继承抽象类和实现接口
interface IMessage
{
    public void print();
}

abstract class News
{
    public abstract void getNews();
}


class MessageNews extends News implements IMessage
{
    public void print()
    {
        System.out.println("sdika boku ga siki");
    }
    public void getNews()
    {
        System.out.println("wotashi sidika no kodo o ashiteyilu");
    }
}

public class Abstract2
{
    public static void main(String[] args)
    {
        IMessage m = new MessageNews();
        m.print();
        //MessageNews 是抽象类和接口的共同子类
        News news = (News) m;
        news.getNews();
    }
}
