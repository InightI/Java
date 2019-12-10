package comunicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import comunicate.User;

public class tongxun
{
    Map<String,Integer> map = new HashMap<>();
    String a;

    public  void addNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String a = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入电话");
        int b = scanner2.nextInt();
        map.put(a,b);



    }

    public void update()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        if (a.equals(name))
        {
            System.out.println("请输入新的电话");
            int newNum = scanner2.nextInt();
            map.replace(name, newNum);
        } else
        {
            System.out.println(" 姓名错误");
        }
    }

    public void delete()
    {

    }

    public void  search(String name)
    {
        System.out.println(map.get(name));
    }

    public static void main(String[] args)
    {
        Map<String,Integer> map = new HashMap<>();
         tongxun a = new tongxun();
         a.addNumber();
         a.update();

    }
}
