package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex14 {
    public static void main(String[] args) {
        System.out.println(lg(1023 ));
    }
    public static int lg(int n){
        int i = 0;
        int m = 1;
        while(m*2<=n){
            m *= 2;
            i++;
        }
        return i;
    }
}
