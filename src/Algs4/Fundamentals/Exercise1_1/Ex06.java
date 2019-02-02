package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex06 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for(int i = 0;i<=15;i++){
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
