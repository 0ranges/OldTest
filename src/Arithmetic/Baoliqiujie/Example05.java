package Arithmetic.Baoliqiujie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2017/4/27.
 */
/*
生成1~n的排列
fail

 */
public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num[] = new int[n];
        Arrays.fill(num,0);
        print(n,num,0);
    }
    public static void print(int n ,int num[],int index){
        if(n == index){
            for(int i :num){
                System.out.printf("%d ",i);
            }
            System.out.printf("\n");
        }else for(int i = 1;i<=n;i++){
            boolean flag = true;
            for(int j = 0;j<index;j++){
                if(i == num[j]){
                    flag = false;
                }
            }
            if(flag){
                num[index] = i;
                print(n,num,index+1);
            }
        }
    }
}
