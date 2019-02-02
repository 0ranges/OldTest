package leetcode.medium;

import java.util.Stack;

/**
 * Created by user on 2018/8/15.
 */
public class Q390 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }
    public static int lastRemaining(int n) {
        Stack<Boolean> stack = new Stack<>();
        while(n > 1){
            if(stack.size() % 2 == 1 && n % 2 == 0){
                stack.push(false);
            }else {
                stack.push(true);
            }
            n /= 2;
        }
        int res = 1;
        while(!stack.isEmpty()){
            boolean flag = stack.pop();
            res *= 2;
            if(!flag)
                res --;
        }
        return res;
    }
}
