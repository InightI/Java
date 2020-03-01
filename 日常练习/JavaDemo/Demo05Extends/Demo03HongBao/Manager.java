package Demo.Demo05Extends.Demo03HongBao;

import java.util.ArrayList;

public class Manager extends User
{
   public Manager()
   {

   }
    public Manager(String name, int money)
    {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count)
    {
        //首先需要一个集合,用来存储若干个红包的金额
        ArrayList<Integer> list = new ArrayList<>();

        //先看下群主有多少钱
        int leftMoney = super.getMoney(); //群主当前余额
        if(totalMoney > leftMoney)
        {
            System.out.println("你没有这么多钱!");
            return list; //返回空集合
        }

        //发红包成功,扣钱,重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; //余数,剩下的零头

        //除不开的零头,放在最后一个红包里
        for(int i = 0; i < count - 1; i++)
        {
            list.add(avg);
        }

        int last = avg + mod;
        list.add(last);
        return list;

    }

}
