package com.HomeWork;

public class RemoveKListNode
{
   public  ListNode removeKthFromEnd(ListNode head, int k)
   {
       ListNode p1 = head;
       ListNode p2 = head;

       for(int i = 0; i < k; i++)
       {
           p1 = p1.next;
       }

       if(p1 == null)
       {
           head = head.next;
           return head;
       }

       while(p1.next != null)
       {
           p1 = p1.next;
           p2 = p2.next;
       }

       p2.next = p2.next.next;
       return head;
   }
}

