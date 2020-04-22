package interviewWork;
//反转链表,递归写法
public class ReverseLinkeList
{
    class Solution {
        public ListNode reverseList(ListNode head)
        {
            if(head == null || head.next == null)
                return head;
            ListNode cur = reverseList(head.next);  //递归后,cur为最后一个
            //假如链表为...4->5->null  则4.next是5, 5.next = head就是 5指向4, head是4
            head.next.next = head;
            head.next = null; //再将4->5 的链子断掉   只留 5->4的
            return cur;
        }
    }
}
