package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex20 {
    public static double ln( int n ){
        if(n == 0)
            return 0;
        else
            return Math.log(n)+ln(n-1);
    }

    public static void main(String[] args) {
        System.out.println(ln(10));
    }
}
