package leetcode.medium;

import java.util.HashSet;

/**
 * Created by user on 2018/4/10.
 */
public class Q142 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode pre = head;
        if(pre == null)
            return null;
        ListNode next = head.next;
        while(next!=null&&next.next!=null){
            if(pre == next){
                HashSet<ListNode> set = new HashSet<>();
                pre = head;
                while(true){
                    if(set.contains(pre))
                        return pre;
                    set.add(pre);
                    pre = pre.next;
                }
            }
            pre = pre.next;
            next = next.next.next;
        }
        return null;
    }
}
