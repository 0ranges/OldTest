package Algs4.Fundamentals.Exercise1_3;

import Algs4.Fundamentals.Chapter1_3.Stack;

import java.util.Scanner;

/**
 * Created by user on 2017/11/26.
 */
/*
 *  Ex10
 *  % java InfixToPostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  2 3 4 + 5 6 * * +
 *
 *  % java InfixToPostfix | java EvaluatePostfix
 *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
 *  [Ctrl-d]
 *  212
 */
public class InfixToPostifx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        while (input.hasNext()){
            String s = input.next();
            if(s.equals("+"))
                stack.push(s);
            else if(s.equals("*"))
                stack.push(s);
            else if(s.equals("("))
                System.out.print("");
            else if(s.equals(")"))
                System.out.print(stack.pop()+" ");
            else
                System.out.print(s+" ");
        }
    }
}
