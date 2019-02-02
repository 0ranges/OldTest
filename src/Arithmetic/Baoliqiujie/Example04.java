package Arithmetic.Baoliqiujie;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/25.
 */
/*
双基回文数
如果一个正整数n至少在两个不同的进位制b1和b2下都是回文数（2<=b1,b2<=10）,
则称n是双基回文数（回文数不能包含前导零）。
输入正整数S<10^6，输出比S大的最小双基回文数。
例子：
输入：
1600000
输出：
1632995
 */
public class Example04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean flag = false;
        while(!flag){
            int count = 0;
            for(int i = 2;i<=10;i++){
                Vector<Integer> vector = new Vector<>();
                int x = n;
                boolean judge = true;
                vector.add(x%i);
                while(x/i != 0){
                    x /= i;
                    vector.add(x%i);
                }
                for(int j = 0;j<vector.size()/2;j++){
                    if(vector.get(j) != vector.get(vector.size()-1-j)){
                        judge = false;
                        break;
                    }
                }
                if(judge){
                    count++;
                }
            }
            if(count >= 2){
                System.out.printf("%d",n);
                flag = !flag;
            }
            n++;
        }
    }
}
