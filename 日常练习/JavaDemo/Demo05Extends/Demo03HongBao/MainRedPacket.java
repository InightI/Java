package Demo.Demo05Extends.Demo03HongBao;

import javax.swing.*;
import java.util.ArrayList;

public class MainRedPacket
{
    public static void main(String[] args)
    {
        Manager manager = new Manager("群主Sikadi",10000);

        Member one = new Member("yuki",16);
        Member two = new Member("kurumi",222);
        Member three = new Member("Lifu",666);

        manager.showMoney();
        one.showMoney();
        two.showMoney();
        three.showMoney();
        System.out.println("==================");

        //发红包
        ArrayList<Integer> list = manager.send(2333,3);
        System.out.println("发钱啦");
        //收红包
        System.out.println();
        one.recieve(list);
        two.recieve(list);
        three.recieve(list);

        manager.showMoney();
        one.showMoney();
        two.showMoney();
        three.showMoney();

    }
}
