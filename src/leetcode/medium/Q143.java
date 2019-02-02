package leetcode.medium;

/**
 * Created by user on 2018/4/9.
 */
public class Q143 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void reorderList(ListNode head) {
        if(head == null||head.next == null||head.next.next == null)
            return;
        ListNode first = head;
        ListNode second = head;
        while(first!=null&&first.next!=null&&first.next.next != null){
            while(second.next!=null&&second.next.next!=null)
                second = second.next;
            second.next.next = first.next;
            first.next = second.next;
            second.next = null;
            first = first.next.next;
            second = first;
        }
    }
}
