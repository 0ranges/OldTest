package leetcode.hard;

/**
 * Created by user on 2018/8/3.
 */
public class Q778 {
    public int swimInWater(int[][] grid) {
        int res = 0;
        int n = grid.length;
        for(int[] g : grid){
            for(int i : g)
                res = Math.max(i,res);
        }
        int lo = 0;
        int hi = res;
        while(lo <= hi){

        }
        return res;
    }
}
