package Algs4.Sorting.Chapter2_3;

import Algs4.Sorting.Chapter2_1.Example;
import Algs4.Sorting.Chapter2_1.Insertion;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created by user on 2017/11/30.
 */
public class Quick extends Example {
    private static int partition(Comparable[] a,int lo,int hi){
        int i = lo;
        int j = hi+1;
        Comparable v = a[lo];
        while(true){
            while(less(a[++i],v))
                if(i == hi)
                    break;
            while(less(v,a[--j]))
                if(j == lo)
                    break;
            if(i>=j)
                break;
            exch(a,i,j);
        }
        return j;
    }

    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo)
            return;
        /*
        //对于小规模采用插入排序，
        if(hi<=lo+10){
            Insertion.sort(a,lo,hi);
            return;
        }*/
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
}
