package com.HomeWork;

public class FrogsJumpSteps
{
    public static void main(String[] args)
    {
        System.out.println(JumpFloorII(10));
    }
    public  static  int JumpFloorII(int target)
    {
        if(target <= 0)
        {
            return 0;
        }
        else if(target == 1)
        {
            return 1;
        }
        else
        {
            return 2 * JumpFloorII( target - 1);
        }
    }
}
