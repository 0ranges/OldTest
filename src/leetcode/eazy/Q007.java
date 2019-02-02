package leetcode.eazy;

import JAVA.JavaClass.InterDemo;

/**
 * Created by user on 2018/8/2.
 */
public class Q007 {
    public int reverse(int x) {
        String str = "";
        boolean flag = true;
        if(x < 0)
            flag = false;
        long res = x;
        res = Math.abs(x);
        if(x == 0)
            return 0;
        while(res > 0){
                if(res % 10 != 0 || !str.equals(""))
                str += res % 10;
            res /= 10;
        }
        res = Long.parseLong(str);
        if(!flag)
            res = 0 - res;
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        else
            return (int)res;
    }
}
