package leetcode.Sward;

import leetcode.ListNode;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/19 20:33
 * @description :
 *
 * 反转链表
 *
 */
public class Q020 {
    //递归
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList(next);
        next.next = head;
        return newHead;
    }
    //迭代
    public ListNode ReverseList02(ListNode head) {
        ListNode pre = new ListNode(-1);
        while (head != null){
            ListNode next = head.next;
            head.next = pre.next;
            pre.next = head;
            head = next;
        }
        return pre.next;
    }
}
