package Arithmetic.Exercise;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/30.
 */
/*
A+B(2)

Description
Your task is to Calculate a + b.

Input
There are multiple test cases. Each test case contains only one line. Each line consists of a pair of real number a and b（0<=a,b<=1000000）, separated by a space.

Output
For each case, output the answer in one line rounded to 4 digits after the decimal point.

Sample Input
1 5
10 20
0.1 1.5
Sample Output
6.0000
30.0000
1.6000
 */
public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<String> vector = new Vector<>();
        while (input.hasNextLine()){
            String str = input.nextLine().trim();
            if("".equals(str)){
                break;
            }else{
                vector.add(str);
            }
        }
        for(String str:vector){
            int index = str.indexOf(' ');
            double a = Double.parseDouble(str.substring(0,index));
            double b = Double.parseDouble(str.substring(index+1));
            System.out.printf("%.4f\n",a+b);
        }
    }
}
