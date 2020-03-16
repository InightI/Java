package StringDemo.Demo01;
//练习:
/*
把数组{1,2,3}按照指定格式拼接成一个字符串
1.先准备一个int[]数组,
2.定义一个方法,用来将数组变成字符串
三要素:
返回值类型 String
方法名称 fromArrayToString
参数列表 int[]
3.格式 [EVE1#EVE2#PVP3]
4.调用方法,得到返回值,并打印结果字符串
 */
public class Demo08StringPractise
{
    public static void main(String[] args)
    {
        int [] arr = {1,2,3};
        String str = fromArrayToString(arr);
        System.out.println(str);
    }
    public static String fromArrayToString (int [] arr)
    {
        String str1 = "[";
        for(int i = 0; i <arr.length; i++)
        {
            if(i == arr.length - 1)
            {
                str1 = str1 + "PVP" + arr[i] + "]";
            }
            else
            {
                str1 = str1 + "EVE" + arr[i] + "#";
            }

        }
        return str1;
    }
}
