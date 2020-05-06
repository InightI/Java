package interviewWork;

import java.util.Scanner;
/*
输入描述:
输入一个string型基因序列，和int型子串的长度


输出描述:
找出GC比例最高的子串,如果有多个输出第一个的子串
 */
public class DNAStr
{
    public static double GCRatio(String str)
    {
        double ratio = 0;
        double count = 0;
        for(char ch : str.toCharArray())
        {
            if(ch == 'G' || ch == 'C')
            {
                count++;
            }
        }
        ratio = count / (double)str.length();
        return ratio;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String dna = sc.nextLine();
        int usedSize = sc.nextInt();

        String maxStr = ""; //记录比例最高的字符串
        double maxRatio = 0; //记录目前出现的最高比例

        for(int i = 0; i < dna.length() - usedSize + 1; i++)
        {
            String str = dna.substring(i, i + usedSize);
            if(GCRatio(str) > maxRatio)
            {
                maxStr = str;
                maxRatio = GCRatio(str);
            }
        }
        System.out.println(maxStr);
    }
}
