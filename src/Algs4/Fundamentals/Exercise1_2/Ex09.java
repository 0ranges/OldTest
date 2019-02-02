package Algs4.Fundamentals.Exercise1_2;

/**
 * Created by user on 2017/11/23.
 */
public class Ex09 {
    public static int rank(int key,int[] a,Counter counter){
        return rank(key,a,0,a.length-1,counter);
    }
    public static int rank(int key,int[] a,int lo,int hi,Counter counter){
        if(lo>hi)
            return -1;
        counter.increment();
        int mid = lo+(hi-lo)/2;
        if(a[mid] == key){
            return mid;
        }else if(key<a[mid]){
            return rank(key,a,lo,mid-1,counter);
        }else{
            return rank(key,a,mid-1,hi,counter);
        }
    }
}
