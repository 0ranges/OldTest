package CodeM.codeM2017;

import java.util.Scanner;

/**
 * Created by user on 2018/6/9.
 */
/*
链接：https://www.nowcoder.com/acm/contest/5/A
来源：牛客网

题目描述
给定两个整数 l 和 r ，对于所有满足1 ≤ l ≤ x ≤ r ≤ 10^9 的 x ，把 x 的所有约数全部写下来。对于每个写下来的数，只保留最高位的那个数码。求1～9每个数码出现的次数。
输入描述:
一行，两个整数 l 和 r (1 ≤ l ≤ r ≤ 10^9)。
输出描述:
输出9行。

第 i 行，输出数码 i 出现的次数。
示例1
输入

复制
1 4
输出

复制
4
2
1
1
0
0
0
0
0
 */
public class Main01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        int[] res = new int[10];
        for(int i = l;i<=r;i++){
            for(int j = 1;j*j<=i;j++){
                if(i%j == 0){
                    int k1 = j;
                    int k2 = i/j;
                    if(k1 == k2){
                        while(k2 >=10)
                            k2 /= 10;
                        res[k2]++;
                    }else {
                        while (k1 >= 10)
                            k1 /= 10;
                        while (k2 >= 10)
                            k2 /= 10;
                        res[k1]++;
                        res[k2]++;
                    }
                }
            }
        }
        for(int i = 1;i<10;i++)
            System.out.println(res[i]);
    }
}
