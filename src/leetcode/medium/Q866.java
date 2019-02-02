package leetcode.medium;

/**
 * Created by user on 2018/8/17.
 */
public class Q866 {
    public static void main(String[] args) {
        System.out.println(primePalindrome(13));
    }
    public static int primePalindrome(int N) {
        if(N % 2 == 0)
            N++;
        if(N == 1)
            N = 3;
        while(true){
            if(isHW(N) && isSS(N))
                return N;
            N += 2;
        }
    }
    public static boolean isHW(int N){
        String s = "" + N;
        char[] c = s.toCharArray();
        int lo = 0;
        int hi = c.length - 1;
        while (lo < hi){
            if(c[lo] != c[hi])
                return false;
            lo++;
            hi--;
        }
        return true;
    }
    public static boolean isSS(int N){
        for(int i = 2;i <= Math.sqrt(N);i++){
            if(N % i == 0)
                return false;
        }
        return true;
    }
}
