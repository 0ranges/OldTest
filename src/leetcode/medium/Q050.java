package leetcode.medium;

/**
 * Created by user on 2018/4/17.
 */
public class Q050 {
    public double myPow(double x, int n) {
        return n>=0?pow(x,n):1/pow(x,0-n);
    }
    public double pow(double x,int n){
        if(n == 0)
            return 1.0;
        if(n % 2 == 0) {
            double a = pow(x, n / 2);
            return a * a;
        }
        else{
            double a = pow(x, n / 2);
            return a * a * x;
        }
    }
}
