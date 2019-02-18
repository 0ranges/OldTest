package leetcode.Sward;

import leetcode.ListNode;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/18 14:46
 * @description :
 * 在 O(1) 时间内删除链表节点
 *
 * 如果进行 N 次操作，那么大约需要操作节点的次数为 N-1+N=2N-1，
 * 其中 N-1 表示 N-1 个不是尾节点的每个节点以 O(1) 的时间复杂度
 * 操作节点的总次数，N 表示 1 个尾节点以 O(N) 的时间复杂度操作节
 * 点的总次数。(2N-1)/N ~ 2，因此该算法的平均时间复杂度为 O(1)。
 */
public class Q015 {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if(head == null || tobeDelete == null){
            return head;
        }
        if(tobeDelete.next != null){
            ListNode next = tobeDelete.next;
            tobeDelete.val = next.val;
            tobeDelete.next = next.next;
        }else{
            ListNode cur = head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = null;
        }
        return head;
    }
}

