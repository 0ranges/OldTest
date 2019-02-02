package leetcode.medium;

/**
 * Created by user on 2017/12/16.
 */
public class Q495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if(n == 0)
            return 0;
        else if(n == 1)
            return duration;
        else{
            int all = 0;
            for(int i = 1;i<n;i++){
                if(timeSeries[i]-timeSeries[i-1] >= duration)
                    all += duration;
                else
                    all += timeSeries[i]-timeSeries[i-1];
            }
            all += duration;
            return all;
        }
    }
}
