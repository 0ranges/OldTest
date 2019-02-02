package leetcode.medium;

/**
 * Created by user on 2017/12/26.
 */
public class Q328 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head != null){
            ListNode pre = head;
            ListNode next = head.next;
            ListNode nextHead = next;
            while(next!=null&&next.next!=null){
                pre.next = pre.next.next;
                next.next = next.next.next;
                pre = pre.next;
                next = next.next;
            }
            pre.next = nextHead;
        }
        return head;
    }
}
