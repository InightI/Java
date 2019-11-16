package com.lx20191115;
import java.util.*;
/**
 * 删除公共字符串
 */
public class DeleteCommonChar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for(int i = 0; i < ch.length; i++)
            {
                if(!str.contains(String.valueOf(ch[i])))
                {
                    System.out.print(ch[i]);
                }
            }
        }

    }

}
