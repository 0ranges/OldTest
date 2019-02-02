package leetcode.eazy;

import java.util.Stack;

/**
 * Created by user on 2018/3/17.
 */
public class Q020 {
    public boolean isValid(String s) {
        if(s.length()%2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('||c == '['||c == '{')
                stack.push(c);
            else{
                if(stack.size() == 0)
                    return false;
                char C = stack.pop();
                if(!(C == '('&&c == ')'||C == '['&&c == ']'||C == '{'&&c == '}'))
                    return false;
            }
        }
        return stack.size() == 0;
    }
}
