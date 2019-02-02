package leetcode.medium;

/**
 * Created by user on 2018/8/6.
 */
public class Q858 {
    public static void main(String[] args) {
        System.out.println(mirrorReflection(3,1));
    }
    public static int mirrorReflection(int p, int q) {
        int i = gys(Math.max(p,q),Math.min(p,q));
        p /= i;
        q /= i;
        if(q % 2 == 0)
            return 0;
        else{
            if(p % 2 == 0)
                return 2;
            else
                return 1;
        }
    }
    //最小公倍数
    public static int gys(int p,int q){
        if(p % q == 0)
            return q;
        else
            return gys(q,p%q);
    }
}
