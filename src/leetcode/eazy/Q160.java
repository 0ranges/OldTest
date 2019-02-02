package leetcode.eazy;

import java.util.Stack;

/**
 * Created by user on 2018/7/23.
 */
public class Q160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();
        for(ListNode node = headA ; node != null ; node = node.next){
            stackA.push(node);
        }
        for(ListNode node = headB ; node != null ; node = node.next){
            stackB.push(node);
        }
        if(stackA.isEmpty() || stackB.isEmpty()){
            return null;
        }
        ListNode result = null;
        while (!stackA.isEmpty()&&!stackB.isEmpty()&&stackA.peek() == stackB.peek()){
            result = stackA.peek();
            stackA.pop();
            stackB.pop();
        }
        return result;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}