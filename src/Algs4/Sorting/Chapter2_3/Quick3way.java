package Algs4.Sorting.Chapter2_3;

import Algs4.Sorting.Chapter2_1.Example;

/**
 * Created by user on 2017/11/30.
 */
public class Quick3way extends Example {
    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo)
            return;
        int lt = lo;
        int i = lo;
        int gt = hi;
        Comparable v = a[lo];
        while(i<=gt){
            int cmp = v.compareTo(a[i]);
            if(cmp>0)
                exch(a,lt++,i++);
            else if(cmp<0)
                exch(a,i,gt--);
            else
                i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }
}
