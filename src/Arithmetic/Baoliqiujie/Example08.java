package Arithmetic.Baoliqiujie;

import java.util.Scanner;

/**
 * Created by user on 2017/5/3.
 */
/*
生成子集
增量构造法
 */
public class Example08 {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[] = new int[n];
        print(n,A,0);
    }
    public static void print(int n,int A[],int index){
        for(int i = 0;i<index;i++){
            System.out.printf("%d ",A[i]);
        }
        count++;
        System.out.println("\t"+count);
        int s = index>0?A[index-1]+1:1;
        for(int i = s;i<=n;i++){
            A[index] = i;
            print(n,A,index+1);
        }
    }
}
