package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex09 {
    public static void main(String[] args) {
        String s = "";
        int N = 2134;
        for(int n = N;n>0;n /= 2)
            s = (n%2) + s;
        System.out.println(s);


        s = Integer.toBinaryString(N);
        System.out.println(s);
    }
}
