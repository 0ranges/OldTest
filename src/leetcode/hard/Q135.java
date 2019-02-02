package leetcode.hard;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by user on 2018/8/17.
 */
public class Q135 {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,3,2,2,1}));
    }
    public static int candy(int[] ratings) {
        int n = ratings.length;
        if(n == 1)
            return 1;
        int[] res = new int[n];
        int[][] temp = new int[n][2];
        for(int i = 0;i < n;i++){
            temp[i][0] = ratings[i];
            temp[i][1] = i;
        }
        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for(int i = 0;i < n;i++){
            int index = temp[i][1];
            if(index == 0)
                res[0] = ratings[0] == ratings[1] ? 1 : res[1] + 1;
            else if(index == n - 1)
                res[index] = ratings[index] == ratings[index - 1] ? 1 : res[index - 1] + 1;
            else if(ratings[index] == ratings[index - 1] &&ratings[index] == ratings[index + 1])
                res[index] = 1;
            else if(ratings[index] == ratings[index - 1])
                res[index] = res[index + 1] + 1;
            else if(ratings[index] == ratings[index + 1])
                res[index] = res[index - 1] + 1;
            else
                res[index] = Math.max(res[index - 1],res[index + 1]) + 1;
        }
        int result = 0;
        for(int i : res)
            result += i;
        return result;
    }
}
