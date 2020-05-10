package interviewWork;
//https://leetcode-cn.com/problems/linked-list-cycle/
public class _141_判断环形链表
{
    public class Solution
    {
        public boolean hasCycle(ListNode head)
        {
            if(head == null)
            {
                return false;
            }

            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow)
                {
                    return true;
                }
            }
            return false;
        }
    }
}
