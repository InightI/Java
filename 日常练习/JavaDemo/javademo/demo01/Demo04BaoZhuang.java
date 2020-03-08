package javademo.demo01;

public class Demo04BaoZhuang
{
    public static void main(String[] args)
    {
        //装箱
        //构造方法
        Integer int1 = new Integer(10);//编译器会提示已过时
        System.out.println(int1);

        //静态方法
        Integer int2 = Integer.valueOf(16);//也已过时
        System.out.println(int2);

        //拆箱
        int i = int1.intValue();//已过时
        System.out.println(i);

        System.out.println("===================");
        //自动装箱
        Integer int3 = 15;

        //自动拆箱
        //包装类无法直接参与运算,可以自动装换为基本类型的数据,再参与计算
        int3 = 15 + 6;
        System.out.println(int3);


    }
}
