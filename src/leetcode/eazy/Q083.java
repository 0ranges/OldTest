package leetcode.eazy;

import java.util.HashSet;

/**
 * Created by user on 2018/8/3.
 */
public class Q083 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        HashSet<Integer> set = new HashSet<>();
        ListNode res = new ListNode(head.val);
        ListNode res_ = res;
        set.add(head.val);
        for(head = head.next;head != null;head = head.next){
            if(set.add(head.val)){
                res_.next = new ListNode(head.val);
                res_ = res_.next;
            }
        }
        return res;
    }
}
