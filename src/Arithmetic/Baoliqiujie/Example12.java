package Arithmetic.Baoliqiujie;

/**
 * Created by user on 2017/5/18.
 */

import java.util.Scanner;

/**
 * 素数环
 * success
 */
public class Example12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        a[0] = 1;
        dfs(1,n,a);

    }
    public static void dfs(int index ,int n,int a[]){
        if(index == a.length){
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }else {
            for(int i = 1;i<=n;i++){
                boolean flag = true;
                for(int j = 0;j<index;j++){
                    if(a[j] == i)
                        flag = false;
                }
                boolean isP = true;
                if(index == n-1){
                    isP = isPrime(1+i);
                }
                if(flag&&isPrime(i+a[index-1])&&isP){
                    a[index] = i;
                    dfs(index+1,n,a);
                    a[index] = 0;
                }
            }
        }
    }
    public static boolean isPrime(int n ){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
