package Arithmetic.Exercise;

import java.util.Scanner;

/**
 * Created by user on 2017/4/30.
 */
/*
A+B(1)
Description
Your task is to Calculate a + b.

Input
Input contains multiple test cases. Each test case consists of a pair of integers a and b ( 0 <= a, b <= 20 ), separated by a space, one pair of integers per line.

Output
For each pair of input integers a and b you should output the sum of a and b in one line, and with one line of output for each line in input.

Sample Input
1 1
Sample Output
2
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            System.out.printf("%d\n",input.nextInt()+input.nextInt());
        }
    }
}
