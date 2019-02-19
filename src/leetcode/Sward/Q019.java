package leetcode.Sward;

import leetcode.ListNode;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/19 20:28
 * @description :
 * 一个链表中包含环，请找出该链表的环的入口结点。要求不能使用额外的空间。
 */
public class Q019 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null || pHead.next == null){
            return null;
        }
        ListNode slow = pHead;
        ListNode fast = pHead;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while (slow != fast);
        fast = pHead;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
