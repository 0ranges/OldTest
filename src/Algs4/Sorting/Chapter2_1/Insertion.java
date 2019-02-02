package Algs4.Sorting.Chapter2_1;

/**
 * Created by user on 2017/11/29.
 */
public class Insertion extends Example {
    public static void sort(Comparable[] a){
        int n = a.length;
        for(int i = 1;i<n;i++){
            for(int j = i;j>0&&less(a[j],a[j-1]);j--)
                exch(a,j,j-1);
        }
    }
    public static void main(String[] args){
        String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
        sort(a);
        show(a);
    }
}
