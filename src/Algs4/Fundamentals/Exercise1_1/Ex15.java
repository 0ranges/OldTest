package Algs4.Fundamentals.Exercise1_1;

import java.util.Arrays;

/**
 * Created by user on 2017/11/14.
 */
public class Ex15 {
    public static void main(String[] args) {
        int[] a = {1,1,2,5,1,6,5,4,9,8,7,7,8};
        int[] result = histogram01(a,9);
        for(int i:result)
            System.out.print(i+" ");
    }
    public static int[] histogram01(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < M) {
                result[a[i]]++;
            }
        }
        return result;
    }
    public static int[] histogram02(int[] a,int m){
        int[] result = new int[m];
        Arrays.sort(a);
        int index = 0;
        int n = 0;
        while(index<a.length&&n<m){
            if(a[index] == n){
                result[n]++;
                index++;
            }
            else if(a[index] < n){
                index++;
            }else {
                n++;
            }
        }
        return result;
    }
}
