package leetcode.medium;

import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 2018/7/26.
 */
public class Q539 {
    public int findMinDifference(List<String> timePoints) {
        int[] res = new int[timePoints.size()];
        int i = 0;
        for(String time : timePoints){
            res[i++] = Integer.parseInt(time.substring(0,2))*60 + Integer.parseInt(time.substring(3,5));
        }
        Arrays.sort(res);
        int time = res[--i] - res[0];
        int result = time > 720?1440-time:time;
        for(;i>=1;i--){
            time = res[i] - res[i-1];
            result = Math.min(result, time > 720?1440-time:time);
        }
        return result;
    }
}
