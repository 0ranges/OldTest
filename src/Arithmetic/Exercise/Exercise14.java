package Arithmetic.Exercise;

import java.util.Scanner;

/**
 * Created by user on 2017/5/29.
 */
public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        for(int i = 0;i<sum;i++){
            for(int j = 0;j<sum;j++){
                if(i==0||i==sum-1||j==0||j==sum-1)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
