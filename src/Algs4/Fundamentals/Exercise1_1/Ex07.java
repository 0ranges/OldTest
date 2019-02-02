package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex07 {
    public static void main(String[] args) {
        double t = 9.0;
        while(Math.abs(t-9.0/t)>0.001){
            t = (9.0/t+t)/2;
        }
        System.out.print(t);
    }
}
