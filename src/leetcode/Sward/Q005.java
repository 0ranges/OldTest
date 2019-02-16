package leetcode.Sward;

import java.util.Stack;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/16 13:19
 * @description :
 * 用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
 */
public class Q005 {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public void push(int node){
        in.push(node);
    }
    public int pop() throws Exception {
        if(out.isEmpty()){
            while (!in.isEmpty()){
                out.push(in.pop());
            }
        }
        if(out.isEmpty()){
            throw new Exception("queue is empty");
        }
        return out.pop();
    }
}
