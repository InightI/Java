package javademo.demo01;

import java.util.Arrays;

public class Demo02ArrayCopy
{
    public static void main(String[] args)
    {
        int src []= {1,2,3,4,5};
        int dest []= {10,20,30,40,50};

        System.arraycopy(src,0,dest,1,3);
        System.out.println(Arrays.toString(dest));
    }
}
