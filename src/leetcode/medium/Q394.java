package leetcode.medium;

import java.util.Stack;

/**
 * Created by user on 2018/8/21.
 */
public class Q394 {
    public static void main(String[] args) {
        System.out.println(decodeString("100[leetcode]"));
    }
    public static String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> strs = new Stack<>();
        strs.push("");
        int i = 0;
        int n = s.length();
        while(i < n){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                int j = i;
                int num = 0;
                while(j < n){
                    char jc = s.charAt(j);
                    if(jc <= '9' && jc >= '0'){
                        num = num * 10 + (jc - '0');
                        i = j;
                        j++;
                    }else{
                        count.push(num);
                        break;
                    }
                }
            }else if(c == '['){
                strs.push("");
            }else if(c == ']'){
                String str = strs.pop();
                int co = count.pop();
                String resStr = "";
                for(int k = 0 ;k < co;k++){
                    resStr += str;
                }
                strs.push(strs.pop()+resStr);
            }else{
                strs.push(strs.pop()+c);
            }
            i++;
        }
        return strs.pop();
    }
}
