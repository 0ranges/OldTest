package Arithmetic.Exercise;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/5/19.
 */

/**
 *
 * 应该做对了吧
 * 没看懂例子
 *
 *
 * KI十分喜欢美丽而优雅的斐波那契数列,最近他新认识了一种斐波那契字符串,定义如下

 f (0) = b, f (1) = a,

 f (2) = f (1) + f (0) = ab,

 f (3) = f (2) + f (1) = aba,

 f (4) = f (3) + f (2) = abaab,

 ......

 KI想知道 f (n) 中的第 m 位是什么,你可以帮他解决这个问题吗?

 Input
 第一行有一个整数 T ,表示测试组数。

 接下来的每个测试组包含两个数 n, m 。

 数据范围: T≤ 1000, 0 ≤ n ≤ 90, 1 ≤ m ≤ 1e18

 Output
 对于每个测试组,输出’a’或者’b’

 Sample Input
 54 15 310 2222 23366 2333333333333
 Sample Output
 aaaba
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num[] = new long[90];
        num[0] = 1;
        num[1] = 1;
        for(int i = 2;i<90;i++){
            num[i] = num[i-1]+num[i-2];
        }
        int n = input.nextInt();
        Vector<Long> vector = new Vector<>();
        while (input.hasNextLong()){
            vector.add(input.nextLong());
        }
        for(long i:vector){
            System.out.print(search(num,n,i));
        }
    }
    public static String search(long str[],int n,long m){
        if(m==1){
            if(n == 0)
                return "b";
            else
                return "a";
        }else {
            if (str[n - 1] >= m) {
                return search(str, n - 1, m);
            } else {
                return search(str,n-2,m-str[n-1]);
            }
        }
    }
}
