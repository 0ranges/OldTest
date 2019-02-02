package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex18 {
    public static void main(String[] args) {
        System.out.println(mystery(2,25));
        System.out.println(mystery(3,11));
        System.out.println(mystery01(2,25));
        System.out.println(mystery01(3,11));
    }
    public static int mystery(int a,int b){
        if(b==0)
            return 0;
        if(b%2 == 0)
            return mystery(a+a,b/2);
        return mystery(a+a,b/2)+a;
    }
    public static int mystery01(int a,int b){
        if(b==0)
            return 1;
        if(b%2 == 0)
            return mystery(a+a,b/2);
        return mystery(a+a,b/2)+a;
    }
}
