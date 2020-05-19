package interviewWork;
//找到两个单链表相交的起始节点。
public class IntersectingList
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB)
        {
            if(pA == null)
            {
                pA = headB;
            }
            else pA = pA.next;

            if(pB == null)
            {
                pB = headA;
            }
            else pB = pB.next;
        }
        return pA;
    }

}
