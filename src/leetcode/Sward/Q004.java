package leetcode.Sward;

import leetcode.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/15 23:26
 * @description :
 * 从尾到头反过来打印出每个结点的值。
 */
public class Q004 {
    //递归法
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode != null){
            list.addAll(printListFromTailToHead(listNode.next));
            list.add(listNode.val);
        }
        return list;
    }
    //头插法构建逆序链表
    public ArrayList<Integer> printListFromTailToHead02(ListNode listNode) {
        ListNode head = new ListNode(-1);
        while(listNode != null){
            ListNode node = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = node;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }
    //使用栈
    public ArrayList<Integer> printListFromTailToHead03(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty()) {
            ret.add(stack.pop());
        }
        return ret;
    }
}
