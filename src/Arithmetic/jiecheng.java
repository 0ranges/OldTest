package Arithmetic;

import java.util.Scanner;

/**
 * Created by user on 2017/5/2.
 */
public class jiecheng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int index = 1;
        for(int i = 1;i<=n;i++){
            index *= i;
        }
        System.out.println(jc(n));
    }
    public static int jc(int n){
        if(n>1){
            return n*jc(n-1);
        }else{
            return 1;
        }
    }
}
