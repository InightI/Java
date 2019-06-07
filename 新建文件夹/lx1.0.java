package javalx;

import java.util.Scanner;

public class lx1 //购物模拟
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		float price; //商品的单价
		int count;	//商品的数量
		double total; //购买商品的总价
		float zhekou;// 折扣率
		
		//1.让用户输入三种商品的单价和数量
		//2.计算总价
		
		System.out.print("请输入爱马仕皮带的单价: ");
		price = input.nextFloat(); // 接收输入的价格
		System.out.print("请输入商品数量: ");
		count = input.nextInt();
		total = price * count; // 计算第一个商品总价
		
		System.out.print("请输入路易斯威登手表的单价: ");
		price = input.nextFloat();
		System.out.print("请输入商品的数量: ");
		count = input.nextInt();
		total += price * count; //计算两种商品的累加总价
		
		System.out.print("请输入香奈儿东方屏风香水的单价: ");
		price = input.nextFloat();
		System.out.print("请输入香水的数量: ");
		count = input.nextInt();
		total += price * count ; // 计算三种商品的累计总价
		
		//3.根据总价判断是否打折
		
		if(total > 50000)
		{
			zhekou = 0.3f;//打三折
			System.out.println("恭喜消费 打三折!");
		}
		else
		{
			zhekou = 0.8f;
			System.out.println("打八折!");
		}
		
		//4.打印打折后的应该支付金额
		System.out.printf("最终应该支付金额为: %.1f", total);
		
	}
}
