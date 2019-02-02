package leetcode.medium;

import leetcode.ListNode;

/**
 * Created by user on 2018/8/22.
 */
public class Q019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode head1 = head;
        ListNode head2 = head;
        for(int i = 0;i < n;i ++){
            head1 = head1.next;
        }
        if(head1 == null){
            head = head.next;
            return head;
        }
        for(;head1.next != null;head1 = head1.next){
            head2 = head2.next;
        }
        head2.next = head2.next.next;
        return head;
    }
}
