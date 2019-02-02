package Arithmetic.Baoliqiujie;

import java.util.Scanner;

/**
 * Created by user on 2017/5/3.
 */
/*
生成子集
位向量法
 */
public class Example09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[] = new int[n];
        print(n,A,0);
    }
    public static void print(int n ,int A[],int index){
        if(n == index){
            for(int i = 0;i<n;i++){
                if(A[i] == 1 ) {
                    System.out.printf("%d ", i+1);
                }
            }
            System.out.println();
            return;
        }
        A[index] = 0;
        print(n,A,index+1);
        A[index] = 1;
        print(n,A,index+1);
    }
}
