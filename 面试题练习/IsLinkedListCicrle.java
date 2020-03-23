package com.HomeWork;


public class IsLinkedListCicrle
{
    public boolean IsCycle(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }

}



class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val = x;
        next = null;
    }
}