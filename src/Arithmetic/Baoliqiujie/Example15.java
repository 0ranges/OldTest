package Arithmetic.Baoliqiujie;

/**
 * Created by user on 2017/5/20.
 */

import java.util.Scanner;
import java.util.Vector;

/**
 * 倒水问题
 *
 * fail
 *
 * 宽度优先遍历 不是很会   回去看一哈
 *
 *
 */
public class Example15 {
    public static boolean judge = true;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int x = input.nextInt();
        Vector<String> vector = new Vector<>();
        bfs(a,a,b,0,c,0,x,vector);
    }
    public static void bfs(int a,int a_,int b,int b_,int c,int c_,int x,Vector<String> v){
        String str = "("+a_+" "+b_+" "+c_+")";
        boolean flag = true;
        for(String s:v){
            if(str.equals(s)){
                flag = false;
                break;
            }
        }
        if(flag) {
            v.add(str);
            if ((a_ == x || b_ == x || c_ == x)&&judge) {
                System.out.println(v.size());
                    System.out.println(v);
                    //judge = false;
            } else {
                if (a_ < a && c_ > 0) {
                    if (c_ > a - a_) {
                        bfs(a, a, b, b_, c, c - (a - a_), x, v);
                    } else {
                        bfs(a, a_ + c_, b, b_, c, 0, x, v);
                    }
                }
                if (a_ > 0 && b_ < b) {
                    if (a_ > b - b_) {
                        bfs(a, a_ - (b - b_), b, b, c, c_, x, v);
                    } else {
                        bfs(a, 0, b, b_ + a_, c, c_, x, v);
                    }
                }
                if (b_ > 0 && c > c_) {
                    if (b_ > c - c_) {
                        bfs(a, a_, b, b_ - (c - c_), c, c, x, v);
                    } else {
                        bfs(a, a_, b, 0, c, c_ + b_, x, v);
                    }
                }
                if (a_ > 0 && c_ < c) {
                    if (a_ > c - c_) {
                        bfs(a, a_ - (c - c_), b, b_, c, c, x, v);
                    } else {
                        bfs(a, 0, b, b_, c, c_ + a_, x, v);
                    }
                }

                if (a_ < a && b_ > 0) {
                    if (b_ > a - a_) {
                        bfs(a, a, b, b_ - (a - a_), c, c_, x, v);
                    } else {
                        bfs(a, a_ + b_, b, 0, c, c_, x, v);
                    }
                }
                if (c_ > 0 && b_ < b) {
                    if (c_ > b - b_) {
                        bfs(a, a_, b, b, c, c_ - (b - b_), x, v);
                    } else {
                        bfs(a, a_, b, b_ + c_, c, 0, x, v);
                    }
                }
            }
        }
    }
}
