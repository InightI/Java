package com.lx20191115;
import java.util.*;
/**
 * 括号匹配
 */
public class KuoHaoPiPei
{
    public boolean CheckKuohao(String a, int n)
    {
        Stack<Character> left = new Stack<>();
        if(a == null || a.length() != n)
        {
            return false;
        }

        for(int i = 0; i < n; i++)
        {
            if(a.charAt(i) == '(')
            {
                left.push(a.charAt(i));
            }
            else if(a.charAt(i) == ')')
            {
                if(left.empty())
                {
                    return false;
                }
                else
                {
                    left.pop();
                }
            }
            else
            {
                return false;
            }
        }
        if(!left.empty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
