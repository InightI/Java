
import java.util.HashSet;
import java.util.Scanner;




 
public class Q1 {
 
    public static void main(String[] args){
 
        Scanner cin = new Scanner(System.in);
        HashSet<String> martic = new HashSet<String>();
        while(cin.hasNext()){
            martic.add(cin.next());
        }
        int Number = martic.size();
        System.out.println(Number);
    }


}
