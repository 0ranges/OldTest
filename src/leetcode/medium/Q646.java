package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by user on 2018/8/2.
 */
public class Q646 {
    public int findLongestChain(int[][] pairs) {
        if(pairs.length <= 1)
            return pairs.length;
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int res = 1;
        int index = pairs[0][1];
        for(int i = 1;i<pairs.length;i++){
            if(pairs[i][0] > index){
                res ++;
                index = pairs[i][1];
            }
        }
        return res;
    }
}
