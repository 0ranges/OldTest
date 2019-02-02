package leetcode.hard;

import java.util.Arrays;

/**
 * Created by user on 2017/12/17.
 */
public class Q668 {
    public int findKthNumber(int m, int n, int k) {
        int lo = 1;
        int hi = k;
        int mid;
        while(lo<=hi){
            mid = lo+(hi-lo)/2;
            int count = 0;
            int count_equal = 0;
            for(int i = 1;i<=m;i++) {
                if(mid/i<=n){
                    count += mid/i;
                    if(mid%i == 0)
                        count_equal++;
                }else
                    count += n;
            }
            if(count<k)
                lo = mid+1;
            else if(count-count_equal+1>k)
                hi = mid-1;
            else
                return mid;
        }
        return -1;
    }
}
