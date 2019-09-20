package pkgame;

/**
 * 实现了可攻击对象的抽象类
 * @author Enight
 *
 */

public abstract class Heros implements Assailable {

	private long id;
	private String name;
	private int level;
	private int maxHp;
	private int hp;
	private int attack;
	private int x;
	private int y;
	
	public Heros()
	{
		setMaxHp(100);
		setHp(100);
	}
	
	public Heros(long id, String name)
	{
		this();
		setId(id);
		setName(name);
	}
	
	public double getDistance(int x1, int y1, int x2, int y2)
	{
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	//英雄之间的PK
	//1,.先判断两者之间的距离
	//2.如果距离满足,就进行攻击
	public void PK(Assailable assa)
	{
		if(canFightByDistance(assa) && hp > 0 && assa.getHp() > 0)
		{
			fight(assa);
		}
		else
		{
			System.out.println("由于攻击距离或其他原因,攻击失败");
		}
		
		//打印对战结果
		System.out.println("两位英雄当前状态");
		System.out.println("昵称\tHP\t\tX坐标\tY坐标");
		System.out.println(name + "\t" + hp + "\t" + x + "\t" + y);
		System.out.printf("%s\t%d\t%d\t%d",
				assa.getName(),assa.getHp(),assa.getX(),assa.getY());
	}
	
	
	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public int getLevel() 
	{
		return level;
	}

	public void setLevel(int level) 
	{
		this.level = level;
	}

	public int getMaxHp() 
	{
		return maxHp;
	}

	public void setMaxHp(int maxHp) 
	{
		this.maxHp = maxHp;
	}

	public int getAttack() 
	{
		return attack;
	}

	
	public void setAttack(int attack) 
	{
		this.attack = attack;
	}

	public int getX()
	{
		return x;
	}
	
	
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	

}
