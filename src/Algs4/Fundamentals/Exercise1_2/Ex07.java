package Algs4.Fundamentals.Exercise1_2;

/**
 * Created by user on 2017/11/23.
 */
public class Ex07 {
    public static void main(String[] args) {
        System.out.println(mystery("asfpinvig"));
    }
    public static String mystery(String s){
        int N = s.length();
        if(N<=1)
            return s;
        String a = s.substring(0,N/2);
        String b = s.substring(N/2,N);
        return mystery(a)+mystery(b);
    }
}
