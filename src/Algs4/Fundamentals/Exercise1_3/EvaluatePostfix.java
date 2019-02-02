package Algs4.Fundamentals.Exercise1_3;


import Algs4.Fundamentals.Chapter1_3.Stack;

import java.util.Scanner;

/**
 * Created by user on 2017/11/27.
 */
//Ex12
public class EvaluatePostfix {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String s = input.next();
            if(s.equals("+"))
                stack.push(stack.pop()+stack.pop());
            else if(s.equals("*"))
                stack.push(stack.pop()*stack.pop());
            else
                stack.push(Integer.parseInt(s));
        }
        System.out.println(stack.pop());
    }
}
