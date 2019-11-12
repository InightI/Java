package com.lx20191109;
import java.util.*;
public class HuiWen
{
    public static boolean isHuiWen(String s)
    {
        int i = 0;
        int j = s.length() - 1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int index = 0;
        for(int i = 0; i <= str1.length(); i++)
        {
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i,str2);
            if(isHuiWen(sb.toString()))
            {
              index++;
            }
        }
        System.out.println(index);

    }

}
