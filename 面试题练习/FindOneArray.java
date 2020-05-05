package interviewWork;
//找出数组中出现2个一次出现的数,并按从小到大排列
import java.util.Scanner;
public class FindOneArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sign = 0;
        
        for(int i : arr)
        {
            sign = (sign ^ i);
        }
        sign = ((~sign + 1) & sign);  //这里将sign强制变为1

        int [] result = new int [2];

        for(int i: arr)
        {
            //相同的数异或为0, 即相同的数都为化成0了,只留下不相同的数在数组里
            if((sign & i) == sign)// 1 按位与 任何 奇数 等于1, 按位任何偶数为0, 进行奇偶划分
            {
                result[0] = result[0] ^ i; // 等于sign就是奇数,放这里
            }
            else
            {
                result[1] = result[1] ^ i; //偶数放这里
            }
        }
        if(result[0] < result[1])
        {
            System.out.printf("%d %d%n", result[0], result[1]);
        }
        else
        {
            System.out.printf("%d %d%n", result[1], result[0]);
        }

    }
}
