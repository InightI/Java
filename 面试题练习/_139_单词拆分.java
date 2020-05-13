package interviewWork;
//https://leetcode-cn.com/problems/word-break/
import java.util.List;

public class _139_单词拆分
{
    public boolean wordBreak(String s, List<String> wordDict)
    {
        int n = s.length();

        boolean[] memo = new boolean[n + 1];
        memo[0] = true;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(memo[j] && wordDict.contains(s.substring(j, i)))
                {
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[n];

    }
}
