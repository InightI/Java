package game1;

import java.util.Scanner;

/**
 * 猜数字游戏
 * @author Enight
 *
 */
public class GuessDemo 
{
	public static void main(String[] args) 
	{
		//用户要猜的数字
		//用户猜的次数
		final int price = ((((int)Math.random() * 1000))% 9 + 1) * 1000;//[1000-9000] %9是0到8之间,+1是1-9之间
		int guessPrice = -1;//用户猜的单价
		int count = 0; //用户猜的总次数
		String prizeName = null;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("请输入神秘商品的单价: (" + ++count + "次)");
			guessPrice = new Scanner(System.in).nextInt();
			if(guessPrice == price)//玩家猜对的情况下
			{
				if(count == 1)
				{
					System.out.println("厉害了,一次就猜对了,给你奖励爱疯X");
					prizeName = "iPhoneX";
		
				}
				else if(count >= 2 && count <= 3)
				{
					System.out.println("恭喜猜对了,奖品为华为荣耀手环Zero");
					prizeName = "荣耀手环Zero";
				}
				else
				{
					System.out.println("恭喜猜对了, 奖品为无线蓝牙耳机一副");
					prizeName = "小米蓝牙耳机青春版";
				}
				break;
			}
			else if(guessPrice < price)//没有猜对的情况下
			{
				System.out.println("价格猜小了,请继续!");
			}
			else if(guessPrice > price)
			{
				System.out.println("价格猜大了,请继续!");
			}
			
		}
		if(prizeName == null)
		{
			System.out.println("很遗憾,五次机会已用完,期待下次吧!");
		}
		
	}
}
