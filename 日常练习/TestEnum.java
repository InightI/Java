package com.lx20191113;

public class TestEnum
{
    public static void main(String[] args)
    {
        System.out.println(Season.Spring);
        Season a = Season.Autumn;
        System.out.println(a);
        Season b = Season.Winter;
        System.out.println(b);
    }


    enum Season
    {
        Spring,Sunmer,Autumn,Winter
    }


}
