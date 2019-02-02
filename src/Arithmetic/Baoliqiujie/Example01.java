package Arithmetic.Baoliqiujie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2017/4/25.
 */
/*
除法
输入正整数n，按从小到大的顺序输出所有形如abcde/fghij=n的表达式
其中a~j恰好为数字0~9的一个排列，2<=n<=79
例子：
输入：
62
输出：
79546/01283=62
94736/01528=62
 */
public class Example01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1234; i <= 49876; i++)
            if ((i >= 1234 && i <= 9876) || (i >= 10234 && i <= 49876)) {
                int result = n * i;
                String str = null;
                if (i < 10000) {
                    str = "0" + result + i;
                } else {
                    str = "" + result + i;
                }
                char c[] = str.toCharArray();
                Arrays.sort(c);
                if ("0123456789".equals(new String(c))) {
                    System.out.printf("%d/%s%d=%d\n", result, i < 10000 ? "0" : "", i, n);
                }
            }
    }
}