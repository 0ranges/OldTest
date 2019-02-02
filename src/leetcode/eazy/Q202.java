package leetcode.eazy;

import java.util.HashSet;

/**
 * Created by user on 2017/9/8.
 */
public class Q202 {
    public boolean isHappy(int n) {
        if(n == 1)
            return true;
        HashSet<Integer> set = new HashSet<>();
        int x = 0;
        while(!set.contains(n)&&n!=1) {
            set.add(n) ;
            x = n;
            n = 0;
            while(x!=0){
                n += (int)Math.pow(x%10,2);
                x = x/10;
            }
        }
        return n == 1;
    }
}
