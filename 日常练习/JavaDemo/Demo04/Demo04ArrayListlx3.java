package Demo.Demo04;

import java.util.ArrayList;

//按照指定格式打印集合 {1@2@3@4}
public class Demo04ArrayListlx3
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("小白");
        list.add("大白");
        list.add("小红");
        list.add("小黄");
        printarrayList(list);

    }

    public static void printarrayList(ArrayList<String> list)
    {
        System.out.print("{");
        for(int i = 0; i < list.size(); i++)
        {
            if(i == list.size() - 1)//如果是最后一个元素
            {
                System.out.print("}");
            }
            else
            {
                String temp = list.get(i); //将元素交出去拿去循环
                System.out.print(temp + "@");
            }
        }

    }
}
