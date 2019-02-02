package Arithmetic.Baoliqiujie;

import java.util.Scanner;

/**
 * Created by user on 2017/5/3.
 */
/*
生成可重集的排列
 */
public class Example07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p[] = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = input.nextInt();
        }
        int A[] = new int[n];
        print(n,A,p,0);
    }
    public static void print(int n ,int A[],int p[],int index){
        if(n == index){
            for(int a:A){
                System.out.printf("%d ",a);
            }
            System.out.println();
        }else for(int i = 0;i<n;i++)
        if(i==0||p[i] != p[i-1]){
            int c1 = 0;
            int c2 = 0;
            for(int j = 0;j<index;j++){
                if(A[j] == p[i])
                    c1++;
            }
            for(int j = 0 ;j<n;j++){
                if(p[j] == p[i])
                    c2++;
            }
            if(c1<c2){
                A[index] = p[i];
                print(n,A,p,index+1);
            }
        }
    }
}
