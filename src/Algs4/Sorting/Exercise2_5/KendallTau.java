package Algs4.Sorting.Exercise2_5;

import edu.princeton.cs.algs4.Inversions;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by user on 2017/12/6.
 */
public class KendallTau {
    public static long distance(int[] a,int[] b){
        if(a.length!=b.length)
            throw new IllegalArgumentException("Array dimensions disagree");
        int n = a.length;
        int[] ainv = new int[n];
        for(int i = 0;i<n;i++)
            ainv[a[i]] = i;
        int[] bnew = new int[n];
        for(int i = 0;i<n;i++)
            bnew[i] = ainv[b[i]];
        return Inversions.count(bnew);
    }
    public static int[] permutation(int n){
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
            a[i] = i;
        StdRandom.shuffle(a);
        return a;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] a = KendallTau.permutation(n);
        int[] b = KendallTau.permutation(n);


        // print initial permutation
        for (int i = 0; i < n; i++)
            StdOut.println(a[i] + " " + b[i]);
        StdOut.println();

        StdOut.println("inversions = " + KendallTau.distance(a, b));

    }
}
