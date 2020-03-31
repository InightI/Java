package com.HomeWork;
//移除链表元素
public class DeleteListNode
{

    public ListNode removeElements(ListNode head, int val)
    {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode temp = header;
        while (temp.next != null)
        {
            if (temp.next.val == val)
            {
                temp.next = temp.next.next;
            }

            else
            {
                temp = temp.next;
            }
        }
        return header.next;
    }
}
