package javademo.demo01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class demo01ToString
{
    public static void main(String[] args)
    {
        //String->StringBuilder
        String str = "噫吁嚱";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append(" 危乎高哉 ");
        System.out.println("这是StringBuiler:"+bu);

        //StringBuilder->String
        String s = bu.toString();
        System.out.println("这是String: " + s);
    }
}
