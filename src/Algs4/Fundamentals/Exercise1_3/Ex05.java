package Algs4.Fundamentals.Exercise1_3;

import Algs4.Fundamentals.Chapter1_3.Stack;

/**
 * Created by user on 2017/11/26.
 */
public class Ex05 {
    public static void main(String[] args) {
        int N = 50;
        Stack<Integer> stack = new Stack<>();
        while (N>0){
            stack.push(N%2);
            N = N/2;
        }
        for(int i:stack)
            System.out.print(i);
    }
}
