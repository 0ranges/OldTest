package leetcode.eazy;

/**
 * Created by user on 2018/4/17.
 */
public class Q633 {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        while(i<=Math.sqrt(c))
            i++;
        i--;
        if(i*i == c)
            return true;
        int j = 0;
        while(j<=i){
            int res = i*i+j*j;
            if(res==c)
                return true;
            else if(res<c)
                j++;
            else
                i--;
        }
        return false;
    }
}
