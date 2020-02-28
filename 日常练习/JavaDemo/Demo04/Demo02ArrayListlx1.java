package Demo.Demo04;
//生成10个1-50之间的随机数,装入集合,并遍历集合
import java.util.ArrayList;
public class Demo02ArrayListlx1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            int num = (int)(Math.random() * 50);
            list.add(num);
        }
        for(int i : list)
        {
            System.out.print(i + " ");
        }

    }
}
