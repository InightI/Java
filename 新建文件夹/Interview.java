class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        /* 依次遍历原链表的每个结点，头插一个新的链表中 */
        ListNode newList = null; // newList 有两层含义，新链表的第一个结点，代表着整个链表
        ListNode cur = head;
        while (cur != null) {
            // 因为一会 cur.next 会变化，所以提前保存其值
            ListNode next = cur.next;
            
            // 头插
            cur.next = newList;
            newList = cur;
            
            // 让 cur 往后遍历
            cur = next;
        }
        
        return newList;
    }
}

public class Interview {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		
		n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
		
		Solution s = new Solution();
		ListNode result = s.reverseList(n1);
		// 打印 result
	}
}



