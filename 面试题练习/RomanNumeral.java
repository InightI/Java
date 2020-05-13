package interviewWork;
import java.util.*;
//将罗马数字转成整数
public class RomanNumeral
{
    public static void main(String[] args)
    {
        romanToInt("XXVI");
    }
        public  static int romanToInt(String s)
        {
            int sum = 0;
            int preNum = getValue(s.charAt(0)); //获取第一位数字
            for(int i = 1;i < s.length(); i ++)
            {
                int num = getValue(s.charAt(i)); //获取第二位数字,循环开始,永远在preNum前面
                if(preNum < num)
                {
                    sum -= preNum;
                } else {
                    sum += preNum;
                }
                preNum = num; //更新preNum
            }
            sum += preNum; 
            System.out.println(sum);
            return sum;
        }

        private static int getValue(char ch)
        {
            switch(ch)
            {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }



}
