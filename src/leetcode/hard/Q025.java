package leetcode.hard;

/**
 * Created by user on 2017/9/20.
 */
public class Q025 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public  static ListNode reverseKGroup(ListNode head, int k) {
        int index = 0;
        ListNode node = head;
        while(node!=null&&index!=k){
            node = node.next;
            index++;
        }
        if(index == k){
            node = reverseKGroup(node,k);
            while(index-->0){
                ListNode next = head.next;
                head.next = node;
                node = head;
                head = next;
            }
            head = node;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next_1 = new ListNode(2);
        ListNode next_2 = new ListNode(3);
        ListNode next_3 = new ListNode(4);
        head.next = next_1;
        next_1.next = next_2;
        next_2.next = next_3;
        ListNode result = reverseKGroup(head,2);
    }
}
