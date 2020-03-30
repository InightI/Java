package com.HomeWork;
//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
public class CycleList_1
{
    /*
    1.链表判空
2.设置两个指针q和s，均从head开始

3.只要q不为空或者q下一跳不为空，q向后移两位，s向后移移位

4.移动过程中，如果q和s相遇，则退出3循环

5.此时q如果为空或者q的下一跳为空，说明无环，返回空节点

6.否则q接着后移，head也跟着后移，直到q和head相遇，此时q为出环结点

     */
    public ListNode detectCycle(ListNode head)
    {
        //1.
        if (head == null || head.next == null)
            return null;
        //2.
        ListNode q = head;
        ListNode s = head;
        //3.
        while (q != null && q.next != null)
        {
            q = q.next.next;

            s = s.next;
            //4.
            if (q == s)
                break;
        }
        //5.
        if (q == null || q.next == null)
            return null;
        //6.
        while (q != head)
        {
            q = q.next;
            head = head.next;
        }
        return q;
    }
}
