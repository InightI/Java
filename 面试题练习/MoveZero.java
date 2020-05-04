package interviewWork;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
public class MoveZero
{
    public static void moveZero(int nums[])
    {
        if(nums == null)
        {
            return;
        }
        else
        {
            int j = 0; //左指针 //两个指针i和j
            for(int i = 0; i < nums.length; i++)
            {
                //当前元素!=0，就把其交换到左边，等于0的交换到右边 快排思想
                if(nums[i] != 0)
                {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                    j++;
                }
            }
        }
    }
}
