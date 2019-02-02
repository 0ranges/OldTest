package leetcode.hard;

import java.util.Stack;

/**
 * Created by user on 2018/3/20.
 */
public class Q032 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int start = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(')
                stack.push(i);
            else{
                if(stack.isEmpty())
                    start = i;
                else{
                    stack.pop();
                    if(stack.isEmpty())
                        max = Math.max(max,i-start);
                    else
                        max = Math.max(max,i-stack.peek());
                }
            }
        }
        return max;
    }
}
