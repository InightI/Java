package Demo.Demo04;

import java.util.ArrayList;

/*
数组的长度不可以发生改变,但是ArrayList集合的长度可以发生改变

对于ArrayList来说,有一个尖括号<E>代表泛型
泛型: 也就是装在集合当中的所有元素,全都是统一的哪一种类型

注意: 泛型只能是引用类型,不是基本类型
对于ArrayList集合来说,直接打印得到的不是地址值,而是内容,
如果内容是空,打印出的内容是空的中括号[]

从JDK1.7开始,右侧的尖括号可以不写内容,但是<>本身还是要写的

ArrayList常用方法有:
public boolean add(E e); 向集合当中添加元素,参数的类型和泛型一致,返回值代表是否添加成功
public E get(int index);从集合当中获取元素,参数是索引编号,返回值就是对应位置的元素
public E remove(int index);从集合当中删除元素,参数是索引编号,返回值就是被删除掉的元素
public int size();获取集合的尺寸长度,返回值就是集合中包含的元素个数
 */
public class Demo01ArrayList
{
    public static void main(String[] args)
    {
        //创建了一个ArrayList集合,集合的名称是List,里面装的全都是String字符串类型的数据
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("sakura");
        list.add("kurumi");
        list.add("himawari");
        System.out.println(list);

        System.out.println("第2号下标元素是" + list.get(2)); //从0开始
        System.out.println("第一号下标元素是" + list.get(1));

        list.add("haha");
        System.out.println("===========");
        System.out.println(list);
        list.remove(3);
        System.out.println("删除第三号位置后为" + list);
        System.out.println("该list的长度为" + list.size());

        //遍历集合
        System.out.println("======遍历集合======");
        for(int i = 0; i < list.size(); i++) //集合长度用size
        {
            System.out.println(list.get(i));
        }

        for(String i : list)
        {
            System.out.println(i);
        }
    }
}
