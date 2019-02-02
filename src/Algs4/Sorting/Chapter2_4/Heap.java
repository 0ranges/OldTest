package Algs4.Sorting.Chapter2_4;

import Algs4.Sorting.Chapter2_1.Example;

/**
 * Created by user on 2017/12/5.
 */
public class Heap extends Example {
    public static void sink(Comparable[] a,int k,int N){
        while (k*2<=N){
            int j = k*2;
            if(j<N&&less(a[j],a[j+1]))
                j++;
            if(less(a[k],a[j]))
                exch(a,k,j);
            else
                break;
            k = j;
        }
    }
    public static void sort(Comparable[] a){
        int N = a.length-1;
        for(int k = N/2;k>=1;k--)
            sink(a, k, N);
        while (N > 1) {
            exch(a,1,N--);
            sink(a,1,N);
        }
    }
    public static void main(String[] args){
        String[] a = {null,"S","O","R","T","E","X","A","M","P","L","E"};
        sort(a);
        show(a);
    }
}
