package Algs4.Fundamentals.Exercise1_1;

import java.util.ArrayList;

/**
 * Created by user on 2017/11/14.
 */
public class Ex28 {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,3,4,5,6,6,7,7,8,8,8,8,9,9};
        int n = a.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<n-1;i++){
            if(a[i] != a[i+1])
                result.add(a[i]);
        }
        result.add(a[n-1]);
        int[] b = new int[result.size()];
        for(int i = 0;i<result.size();i++)
            b[i] = result.get(i);
        for(int i:b)
            System.out.print(i+" ");
    }
}
