package interviewWork;

public class ExcelNums
{
    public int TitleToNum(String s)
    {
        int resNum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int num = s.charAt(i) - 'A' + 1;
            resNum = resNum * 26 + num;
        }
        return resNum;
    }
}

