package interviewWork;
import java.util.*;
public class KuoHao
{


    public class Parenthesis {
        public boolean chkParenthesis(String A, int n)
        {
            Stack<Character> stack = new Stack<>();
            char[] chars = A.toCharArray();
            for(int i = 0; i < n; i++)
            {
                if(chars[i] == '(')
                {
                    stack.push(chars[i]);
                }
                else if(chars[i] == ')')
                {
                    if(stack.empty())
                    {
                        return false;
                    }
                    else
                    {
                        stack.pop();
                    }
                }
                else
                {
                    return false;
                }
            }
            return true;

        }
    }
}
