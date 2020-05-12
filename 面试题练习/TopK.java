package interviewWork;
import java.util.*;
//找出最小的K个数
public class TopK
{


        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k)
        {

            ArrayList<Integer> arr = new ArrayList<Integer>();
            if(input.length<k||k==0)return arr;
            quickSort(input,0,input.length-1);
            int i=0;
            while(i<k)
            {
                arr.add(input[i]);
                i++;
            }
            return arr;
        }
        void  quickSort(int []arr,int left,int right){
            if(left>=right)return;
            int temp = arr[left];
            int low=left,high=right;
            while(left<right){
                while(arr[right]>=temp && right>left)right--;
                arr[left]=arr[right];
                while(arr[left]<=temp && left<right)left++;
                arr[right]=arr[left];
            }
            arr[right]=temp;
            quickSort(arr,low,right-1);
            quickSort(arr,right+1,high);
        }

}
