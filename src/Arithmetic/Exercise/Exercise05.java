package Arithmetic.Exercise;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/30.
 */
/*
A+B(3)
Description
Your task is to Calculate a + b.

Input
There are multiple test cases. Each test case contains only one line. Each line consists of a pair of integers a and b ( 1 <= a, b <=1016 ) , separated by a space. Input is followed by a single line with a = 0, b = 0, which should not be processed.

Output
For each pair of input integers a and b you should output the sum of a and b in one line, and with one line of output for each line in input.

Sample Input
1 5
10 20
10000000000000000 10000000000000000
0 0
Sample Output
6
30
20000000000000000
 */
public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<String> vector = new Vector<>();
        while (input.hasNextLine()){
            String str = input.nextLine().trim();
            if("0 0".equals(str)){
                break;
            }else{
                vector.add(str);
            }
        }
        for(String str:vector){
            int index = str.indexOf(' ');
            long a = Long.parseLong(str.substring(0,index));
            long b = Long.parseLong(str.substring(index+1));
            System.out.printf("%d\n",a+b);
        }
    }
}
