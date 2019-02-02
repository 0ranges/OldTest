package Arithmetic.ShujujiegouTimu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by user on 2017/4/23.
 */
/*
铁轨
某城市有一个火车站。
有n节车厢从A方向驶入车站，按进站顺序编号为1~n
你的任务是让它们按照某种特定的顺序进入B方向的铁轨并驶出车站
为了重组车厢。你可以借助中转站C。
这是一个可以停放任意多节车厢的车站，一旦从A移入C，就不能再回到A了
一旦从C移入B，就不能回到C了。
换句话说，在任意时刻，只有两种选择：A->C和C->B.
例子：
输入：
5
1 2 3 4 5
5
5 4 1 2 3
6
6 5 4 3 2 1
输出：
Yes
No
Yes
 */
public class Example02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target[] = new int[n+1];
        for(int i = 1;i<n+1;i++){
            target[i] = input.nextInt();
        }
//        int stack[] = new int[10];
//        Arrays.fill(stack,0);
//        boolean ok = true;
//        int A = 1;
//        int B = 1;
//        int top = 0;
//        while(B<=n){
//            if(A == target[B]){
//                A++;
//                B++;
//            }else if(top != 0 && stack[top] == target[B]){
//                top--;
//                B++;
//            }else if(A<=n){
//                stack[++top] = A++;
//            }else{
//                ok = false;
//                break;
//            }
//        }
//        System.out.printf("%s",ok?"yes":"no")   ;
        Stack<Integer> stack = new Stack<>();
        boolean ok = true;
        int A = 1,B = 1;
        while(B<=n){
            if(A == target[B]){
                A++;
                B++;
            }else if(!stack.isEmpty()&&stack.peek() == target[B]){
                B++;
                stack.pop();
            }else if(A<=n){
                stack.push(A++);
            }else {
                ok = false;
                break;
            }
        }
        System.out.printf("%s",ok?"yes":"no")   ;
    }
}
