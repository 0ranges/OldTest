package Algs4.Fundamentals.Exercise1_3;

import Algs4.Fundamentals.Chapter1_3.Stack;

import java.util.Scanner;

/**
 * Created by user on 2017/11/26.
 */
public class Ex04 {
    public static void main(String[] args) {
        //written by myself
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            if(stack.isEmpty())
                stack.push(c);
            else if(c == '('||c == '['||c == '{'){
                stack.push(c);
            }else {
                char pre = stack.pop();
                if((pre == '('&& c == ')')||(pre == '['&& c == ']')||(pre == '{'&& c == '}'))
                    continue;
                else {
                    stack.push(pre);
                    stack.push(c);
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
    //written by others
    public static boolean parentheses(String s,Stack<String> stack){
        String[] inputs = s.split("");
        for(String input:inputs){
            if(input.equals("(")||input.equals("[")||input.equals("{"))
                stack.push(input);
            else if(!stack.isEmpty()){
                if(input.equals(")")){
                    if(stack.pop().equals("("))
                        return false;
                }else if(input.equals("]")){
                    if(stack.pop().equals("["))
                        return false;
                }else if(input.equals("}")){
                    if(stack.pop().equals("{"))
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
