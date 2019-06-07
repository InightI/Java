package game1;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

public class KingOfFighter 
{
	
	//随机数字   
			//Math.random(); //生成左闭右开区间 [0.0,1.0)
			//(int)Math.random() * 10000; 乘一万是去掉小数点,再转成整形  相当于[0, 10000]
			//%10 相当于 取个位  即 
			//(int)(Math.random() * 10000 % 10  [0-9])
			//(int)(Math.random() * 10000 %10 + 5  [5-14] )
			//(int)(Math.random() * 10000 %11 + 5  [5-15]
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		Scanner input = new Scanner(System.in);
		File sound1 = new File ("sounds/拳皇选人音效.wav");
		AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
		sound_choose.play();
		//1.让双方选名字(电脑默认,只需玩家选即可)
		System.out.println("请输入玩家名字: ");
		String userName = input.next();
		String comName = "大蛇";//电脑名称
		System.out.println(userName + "VS" + comName);
		sound_choose.stop();//停止音乐
		
		 sound1 = new File ("sounds/拳皇格斗开始.wav");
		 sound_choose = Applet.newAudioClip(sound1.toURL());
		//2.初始化双方的数据 (体力值默认100)
		
		int hp1 = 100, hp2 = 100; //玩家为P1 双方血量
		int attack1 = 0, attack2 = 0;// 双方攻击力
		
		//3.使用循环模拟对战
		while(hp1 >= 0 && hp2 >= 0)
		{
			attack1 = (int)(Math.random() * 10000 % 19 + 5);
			attack2 = (int)(Math.random() + 10000 %19 + 5);
			
			//让玩家先攻击 
			hp2 -= attack1;//玩家攻击,电脑掉血
			System.out.println(userName + "打出了喵喵怒吼" + comName + "掉血" + attack1 + "滴");
			if(attack1 >= 0 && attack1 <= 5)
			{
				System.out.println(comName + "重重的吃了一记喵喵拳!");
			}
			else if(attack1 >= 10 && attack1 <= 20)
			{
				System.out.println(comName +"吃了一记致命攻击,被锤到快爬不起来了!");
			}
			sound_choose.stop();
			sound1 = new File("sound/攻击音效1.wav");
			sound_choose = Applet.newAudioClip(sound1.toURL());
			sound_choose.play();//播放音乐
			Thread.sleep(3000);// 延迟三秒执行以下代码
			
			
			hp1 -= attack2;
			System.out.println(comName + "使出了汪汪咆哮" + userName + "掉血" + attack2 + "滴");
			if(attack1 >= 0 && attack1 <= 5)
			{
				System.out.println(userName + "被狠狠的咬了一口");
			}
			else if(attack1 >= 10 && attack1 <= 20)
			{
				System.out.println(userName +"被咬的不能自己,快要升天了");
			}
			
			
			sound_choose.stop();
			sound1 = new File ("sounds/攻击音效2.wav");
			sound_choose = Applet.newAudioClip(sound1.toURL());
			sound_choose.play();
			Thread.sleep(500);
			
		}
		
		//4.打印最终结果
		System.out.println("KO!");
		System.out.println("玩家姓名\t血量");
		System.out.println(userName + "\t" + hp1);
		System.out.println(comName + "\t" + hp2);
		
		
		//需要让程序暂停下,以便播放音乐
		System.out.println("请输入任意键继续! ");
		input.nextLine();
		
	}
}
