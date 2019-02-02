package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex22 {
    public static int depth = 0;
    public static int rank(int key,int[] a,int lo,int hi){
        depth++;
        if(lo>hi)
            return -1;
        int mid = lo+(hi-lo)/2;
        System.out.println(lo+" "+mid+" "+hi+" "+depth);
        if(key<a[mid])
            return rank(key,a,lo,mid-1);
        else if(key>a[mid])
            return rank(key,a,mid+1,hi);
        else
            return mid;
    }
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length-1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,6,7,9,10,11,14,16,18,20,24};
        System.out.println(rank(4,a));
    }
}
