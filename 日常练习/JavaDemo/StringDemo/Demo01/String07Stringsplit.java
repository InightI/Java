package StringDemo.Demo01;

/*
分割字符串方法
public String[] split(String regex) 按照参数的规则,将字符串分成若干部分
regex : 正则表达式
如果按照英文句点切分".",按照正则表达式要写"\\."
 */
public class String07Stringsplit
{
    public static void main(String[] args)
    {
        String str1 = "si,ka,di";
        String [] arr1 = str1.split(",");
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("============");

       String str2 = "si.ka.di";
        String [] arr2 = str2.split("\\.");
        for (int i = 0; i <arr2.length ; i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
