package Arithmetic.DP;

import java.util.Scanner;

/**
 * Created by user on 2017/6/3.
 */
/*
Michael喜欢滑雪百这并不奇怪， 因为滑雪的确很刺激。
可是为了获得速度，滑的区域必须向下倾斜，而且当你滑到坡底，
你不得不再次走上坡或者等待升降机来载你。
Michael想知道载一个区域中最长的滑坡。区域由一个二维数组给出。数组的每个数字
代表点的高度。下面是一个例子
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
一个人可以从某个点滑向上下左右相邻四个点之一，当且仅当高度减小。在上面的例子
中，一条可滑行的滑坡为24-17-16-1。当然25-24-23-...-3-2-1更长。事实上，这是最
长的一条。输入输入的第一行表示区域的行数R和列数C(1 <= R,C <= 100)。下面是R行，
每行有C个整数，代表高度h，0<=h<=10000。输出输出最长区域的长度。
72
输入
输入的第一行表示区域的行数R和列数C
(1 <= R,C <= 100)。下面是R行，每行有C个整数，
代表高度h，0<=h<=10000。
输出
输出最长区域的长度。
样例输入
5 5
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
样例输出
25
 */
public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0 ; i<n;i++){
            for(int j = 0;j<m;j++)
                a[i][j] = input.nextInt();
        }
        for(int i = 0 ; i<n;i++) {
            for (int j = 0; j < m; j++) {

            }
        }
    }
}
