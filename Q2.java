import java.util.*;
public class Q2 
{

	
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        while(sc.hasNext()){
	            int n=sc.nextInt();//空汽水瓶数
	            int count=0;//能喝汽水瓶数
	            if(n>0){
	                while(n>1){
	                    count+=n/3;//兑换的瓶数
	                    n=n%3+n/3;//三瓶兑换一瓶+剩下的
	                    if(n==2){
	                        n++;//为两瓶的时候可以借一瓶
	                    }
	                }
	                System.out.println(count);
	            }
	        }
	        sc.close();
	    }
	

}
