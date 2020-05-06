package interviewWork;
import java.util.*;
public class FindKth
{
    public int findKth(int[] a, int n, int K)
    {
        quickSort(a,0,n - 1);
        return a[n - K];
    }

    public static void quickSort(int arr[], int left, int right)
    {
        if(left < right)
        {
            int pivotIndex = quickPart(arr,left,right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr,pivotIndex + 1, right);
        }
    }

    public static int quickPart(int arr[], int left, int right)
    {
        int pivot = arr[left];
        int l = left;
        int r = right;

        while(l < r)
        {
            while(l < r && arr[r] >= pivot)
            {
                r--;
            }
            while(l < r && arr[l] <= pivot)
            {
                l++;
            }

            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
        }

        arr[left] = arr[r];
        arr[r] = pivot;
        return r;
    }
}
