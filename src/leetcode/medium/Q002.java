package leetcode.medium;

import leetcode.ListNode;

/**
 * Created by user on 2018/8/9.
 */
public class Q002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode node = res;
        int jw = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + jw;
            node.next = new ListNode(sum % 10);
            node = node.next;
            jw = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 == null && l2 == null && jw == 1){
            node.next = new ListNode(1);
        }
        if(l1 == null){
            while(l2 != null){
                int sum = l2.val + jw;
                node.next = new ListNode(sum % 10);
                node = node.next;
                jw = sum / 10;
                l2 = l2.next;
            }
            if(jw == 1)
                node.next = new ListNode(1);
        }
        else{
            while(l1 != null){
                int sum = l1.val + jw;
                node.next = new ListNode(sum % 10);
                node = node.next;
                jw = sum / 10;
                l1 = l1.next;
            }
            if(jw == 1)
                node.next = new ListNode(1);
        }
        return res.next;
    }
}
