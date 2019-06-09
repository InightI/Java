package javalx;

/**
 * 打印1997年的月历
 * @author Enight
 * 已知 1997年7月1日(星期二),香港回归举国同庆
 *
 */
public class MyCalendar 
{

	public static void main(String[] args) 
	{
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天");
		System.out.print("\t");
		
		int dayOfMonth = 31;//1997年的7月一共有31天
		for(int i = 1; i <= dayOfMonth; i++)
		{
			System.out.print(i);
			//要判断何时\t, 何时\n(星期天)
			//已知1号星期二
			if((i + 1) % 7 == 0)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print("\t");
			}
			
		}

	}

}
