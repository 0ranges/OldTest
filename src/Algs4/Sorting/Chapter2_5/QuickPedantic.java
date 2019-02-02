package Algs4.Sorting.Chapter2_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by user on 2017/12/6.
 */
public class QuickPedantic {
    public static <Key extends Comparable<Key>> void sort(Key[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    public static <Key extends Comparable<Key>> void sort(Key[] a,int lo,int hi){
        if(hi<=lo)
            return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    private static <Key extends Comparable<Key>> int partition(Key[] a,int lo,int hi){
        int i = lo;
        int j = hi+1;
        Key v = a[lo];
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
        exch(a,lo,j);
        return j;
    }
    private static <Key extends Comparable<Key>> boolean less(Key v,Key w){
        return v.compareTo(w)<0;
    }
    private static <Key extends Comparable<Key>> void exch(Key[] a,int i,int j){
        Key swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    private static <Key extends Comparable<Key>> boolean isSorted(Key[] a){
        for(int i = 1;i<a.length;i++)
            if(less(a[i],a[i-1]))
                return false;
        return true;
    }
    public static <Key extends Comparable<Key>> Key select(Key[] a,int k){
        if(k<0||k>=a.length)
            throw new IndexOutOfBoundsException("Selected element out of bounds");
        StdRandom.shuffle(a);
        int lo = 0,hi = a.length-1;
        while(hi>lo){
            int i = partition(a,lo,hi);
            if(i>k)
                hi = i-1;
            else if(i<k)
                lo = i+1;
            else
                return a[i];
        }
        return a[lo];
    }
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }
    public static void main(String[] args) {
        String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
        QuickPedantic.sort(a);
        show(a);
        assert isSorted(a);

        // display results again using select
        StdOut.println();
        for (int i = 0; i < a.length; i++) {
            String ith = QuickPedantic.select(a, i);
            StdOut.println(ith);
        }
    }
}
