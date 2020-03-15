package Demo.StaticDemo;

import java.util.Arrays;

/*
java.util.Arrays 是一个与数组相关的工具类,里面提供了大量的静态方法,用来实现数组的常见操作
常用:
public static String toString(数组),将参数数组变成字符串
public static void sort(数组),按照默认升序(从小到大)对数组的元素进行排序

注意:
1.如果是数值,sort默认按照升序从小到大
2.如果是字符串,sort默认按照字母升序
3.如果是自定义类型,这个自定义类需要有Comparable或者Comparator接口
 */
public class Demo03Arrays
{
    public static void main(String[] args)
    {
        int arr[] = {6,3,2,8};
        //将int[] 数组按照默认格式变成字符串
        String str1 = Arrays.toString(arr);
        System.out.println(str1);
        //也可一步到位
        System.out.println("一步到位");
        System.out.println(Arrays.toString(arr));

        //排序
        Arrays.sort(arr);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));

        //字符串也可以排序
        String arr2[] = {"zz","yy","aa"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
