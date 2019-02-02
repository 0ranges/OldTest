package leetcode.eazy;

/**
 * Created by user on 2017/12/26.
 */
public class Q141 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode pre = head;
        ListNode next = head;
        while(next.next!=null&&next.next.next!=null){
            pre = pre.next;
            next = next.next.next;
            if(pre == next)
                return true;
        }
        return false;
    }
}
