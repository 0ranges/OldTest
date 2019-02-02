package Algs4.Sorting.Chapter2_2;

import Algs4.Sorting.Chapter2_1.Example;

/**
 * Created by user on 2017/11/30.
 */
public class Merge extends Example {
    private static Comparable[] aux;
    public static void merge(Comparable[] a,int lo,int mid,int hi){
        //将a[lo..mid]和a[mid+1..hi]归并
        int i = lo;
        int j = mid+1;
        for(int k = lo;k<=hi;k++)
            aux[k] = a[k];
        for(int k = lo;k<=hi;k++){
            if(i>mid)
                a[k] = aux[j++];
            else if(j>hi)
                a[k] = aux[i++];
            else if(less(aux[i],aux[j]))
                a[k] = aux[i++];
            else
                a[k] = aux[j++];
        }
    }
    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo)
            return;
        int mid = lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }
}
