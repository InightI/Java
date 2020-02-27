package Demo.Demo03;

import java.util.Scanner;

//匿名对象的使用
public class Demo02Anonymous
{
    public static void main(String[] args)
    {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
////        int num = sc.nextInt();

        //匿名对象的方法
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);

        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        method(sc);

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是 " + num);

    }
    public static void method(Scanner sc)
    {
        int num = sc.nextInt();
        System.out.println("输入的是 " + num);
    }
    public static Scanner methodReturn()
    {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }

}
