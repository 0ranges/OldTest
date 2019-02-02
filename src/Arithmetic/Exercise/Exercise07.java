package Arithmetic.Exercise;

/**
 * Created by user on 2017/5/14.
 */

import java.util.Scanner;

/**
 * 1001. A+B Format (20)
 时间限制
 400 ms
 内存限制
 65536 kB
 代码长度限制
 16000 B
 判题程序
 Standard
 作者
 CHEN, Yue
 Calculate a + b and output the sum in standard format -- that is, the digits must be separated into groups of three by commas (unless there are less than four digits).

 Input

 Each input file contains one test case. Each case contains a pair of integers a and b where -1000000 <= a, b <= 1000000. The numbers are separated by a space.

 Output

 For each test case, you should output the sum of a and b in one line. The sum must be written in the standard format.

 Sample Input
 -1000000 9
 Sample Output
 -999,991

 题意:计算两个数的和,结果加千分符(,)分隔.

 原以为要用字符串处理,后来一想,用递归就可以解决,万能的递归.
 */
public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int num = x + y;
        if(num<0){
            System.out.print("-");
            num = -num;
        }
        print(num);
    }
    public static void print(int num){

        if(num>=1000){
            print(num/1000);
            System.out.printf(",%d",num%1000);
        }else {
            System.out.printf("%d",num);
        }
    }
}
