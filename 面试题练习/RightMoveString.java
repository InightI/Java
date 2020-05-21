package interviewWork;
//右旋字符串
public class RightMoveString
{
    public static void main(String[] args)
    {
        reverseLeftWords("Luxiya", 2);

    }

    public static String reverseLeftWords(String s, int n)
    {
        String sub = s.substring(2);
        System.out.println(sub);
        System.out.println("==============");
        StringBuilder sb = new StringBuilder();
        sb.append(sub);

        String sub2 = s.substring(0, n);
        sb.append(sub2);

        return sb.toString();

    }
}
