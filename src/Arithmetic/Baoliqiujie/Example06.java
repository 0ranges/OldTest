package Arithmetic.Baoliqiujie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 2017/5/2.
 */
public class Example06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        print(list,n);
    }
    public static void print(ArrayList<Integer> list,int n){
        if(n == 0){
            for(int i :list){
                System.out.printf("%d ",i);
            }
            System.out.printf("\n");
        }else{
            for(int i = 0;i<list.size()+1;i++){
                list.add(i,n);
                print(list,n-1);
                list.remove(i);
            }
        }
    }
}
