package Algs4.Sorting.Chapter2_2;

import Algs4.Sorting.Chapter2_1.Example;

/**
 * Created by user on 2017/11/30.
 */
public class MergeBU extends Example{
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
    public static void sort(Comparable[] a){
        int N = a.length;
        aux = new Comparable[N];
        for(int sz = 1;sz<N;sz = sz+sz){
            for(int i = 0;i<N-sz;i+=sz+sz)
                merge(a,i,i+sz-1,Math.min(i+sz+sz-1,N-1));
        }
    }
    public static void main(String[] args){
        String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
        sort(a);
        show(a);
    }
}
