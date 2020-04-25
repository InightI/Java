package interviewWork;
//找出数组中只出现一次的数
public class FindOne
{
    class Solution {
        public int singleNumber(int[] nums)
        {

            int a = 0;
            for(int i : nums)
            {
                a = a ^ i; //两个相同的数异或为0, 0 与任何数异或 为 任何数, 所以最后数组只剩下一个不重复的数
            }
            return a;
        }
    }
}
