package leetcode.medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;

/**
 * Created by user on 2018/7/31.
 */
public class Q743 {
    public static void main(String[] args) {
        int[][] times = {{3,4,1},{2,3,1},{2,1,1}};
        System.out.println(networkDelayTime(times,4,2));
    }
    public static int networkDelayTime(int[][] times, int N, int K) {
        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0])
                    return 1;
                else if(o1[0] < o2[0])
                    return -1;
                else{
                    if(o1[1] > o2[1])
                        return 1;
                    else if(o1[1] < o2[1])
                        return -1;
                    else
                        return 0;
                }
            }
        });
        int[] res = new int[N+1];
        Arrays.fill(res,-1);
        res[K] = 0;
        int[] n_pos = new int[N+2];
        Arrays.fill(n_pos,times.length);
        int index = times[0][0];
        for(int i = 0;i<times.length;i++) {
            if (times[i][0] == index)
                n_pos[index++] = i;
        }
        boolean[][] judge = new boolean[N+1][N+1];
        for(boolean[] j:judge)
            Arrays.fill(j,false);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(K);
        while(!queue.isEmpty()){
            int a = queue.poll();
            for (int i = n_pos[a]; i < n_pos[a + 1]; i++) {
                if(!judge[times[i][0]][times[i][1]]) {
                    queue.add(times[i][1]);
                    int res_ = res[times[i][1]];
                    res[times[i][1]] = res_ == -1 ? res[times[i][0]] + times[i][2] : Math.min(res_, times[i][2] + res[times[i][0]]);
                    judge[times[i][0]][times[i][1]] = true;
                }
            }
        }
        int result = -1;
        for(int i = 1;i<=N;i++){
            if(res[i] == -1)
                return -1;
            else
                result = Math.max(result,res[i]);
        }
        return result;
    }
}
