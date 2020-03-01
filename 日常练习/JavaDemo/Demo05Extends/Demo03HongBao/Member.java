package Demo.Demo05Extends.Demo03HongBao;

import java.util.ArrayList;

public class Member extends User
{
    public Member()
    {

    }

    public Member(String name, int money)
    {
        super(name,money);
    }

    public void recieve(ArrayList<Integer> list)
    {
        //从多个红包当中随便抽一个,给我自己
        //随机获取一个集合当中索引编号
        int index = (int)(Math.random() * list.size());
        //根据索引,从集合当中删除,并且得到被删除的红包给自己
        int delta = list.remove(index); //该红包的金额
        //当前成员本来有多少钱
        int money = super.getMoney();
        //加法,然后重新设置回去
        super.setMoney(money + delta);
    }
    {

    }
}
