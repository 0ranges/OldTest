package leetcode.medium;

/**
 * Created by user on 2017/9/15.
 */
public class Q061 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        int index = 0;
        ListNode need = null;
        ListNode next = new ListNode(0);
        next.next = head;
        while(next.next != null){
            index ++;
            next = next.next;
        }
        next.next = head;
        for(int i = 0;i<=index;i++){
            next = next.next;
            if(i == index - k){
                need = next.next;
                next.next = null;
                next = need;
            }
            if(i == index){
                next.next = head;
            }
        }
        return need;
    }
}
