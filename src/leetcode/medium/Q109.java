package leetcode.medium;

import leetcode.eazy.Q725;

import java.util.List;

/**
 * Created by user on 2018/3/30.
 */
public class Q109 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode sortedListToBST(ListNode head) {
        int size = 0;
        for(ListNode node = head;node!=null;node = node.next)
            size++;
        ListNode[] list = new ListNode[size];
        for(int i = 0;i<size;i++) {
            list[i] = head;
            head = head.next;
        }
        return divide(list,0,size-1);

    }
    public TreeNode divide(ListNode[] list,int start,int end){
        if(start >= end)
            return null;
        else{
            int mid = start+(end-start)/2;
            TreeNode node = new TreeNode(list[mid].val);
            node.left = divide(list,start,mid-1);
            node.right = divide(list,mid+1,end);
            return node;
        }
    }
}
