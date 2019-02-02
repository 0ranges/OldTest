package Algs4.Sorting.Chapter2_1;

/**
 * Created by user on 2017/11/29.
 */
public class Example {
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void show(Comparable[] a){
        for (Comparable anA : a)
            System.out.print(anA + " ");
        System.out.println();
    }
    public static boolean isSorted(Comparable[] a){
        for(int i = 1;i<a.length;i++)
            if(less(a[i],a[i-1]))
                return false;
        return true;
    }
}
