package leetcode.medium;

/**
 * Created by user on 2017/9/7.
 */
public class Q082 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode before=new ListNode(0);
        before.next=head;
        ListNode pre=before;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return before.next;
    }

    public static void main(String[] args) {
        ListNode Head = new ListNode(0);
        Head.next = new ListNode(1);
        System.out.println(Head.next.val);
        Head.next.next = new ListNode(2);
        ListNode pre = Head;
        pre.next = new ListNode(0);
        System.out.println(Head.next.val);
    }
}
