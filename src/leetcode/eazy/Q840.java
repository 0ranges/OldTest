package leetcode.eazy;

import edu.princeton.cs.algs4.In;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : oranges
 * @title : leetcode.eazy
 * @date : 2019/2/12 12:50
 * @description :
 */
public class Q840 {
    public int numMagicSquaresInside(int[][] grid) {
        int res = 0;
        if(grid == null || grid.length < 3 || grid[0].length < 3){
            return res;
        }
        for(int i = 1;i < grid.length-1;i ++){
            for(int j = 1;j < grid[0].length-1;j ++){
                if(grid[i][j] == 5 && judge01(grid,i,j) && judge02(grid,i,j)){
                    res++;
                }
            }
        }
        return res;
    }
    public boolean judge01(int[][] grid,int i,int j){
        Set<Integer> set = new HashSet<>();
        for(int i_ = i-1;i_ <= i+1;i_++){
            for(int j_ = j-1;j_ <= j+1;j_++){
                if(!set.add(grid[i_][j_])){
                    return false;
                }
            }
        }
        for(int k = 1;k <= 9;k++){
            if(!set.contains(k)){
                return false;
            }
        }
        return true;
    }
    public boolean judge02(int[][] grid,int i,int j){
        if(grid[i-1][j-1] + grid[i+1][j+1] != 10){
            return false;
        }
        if(grid[i+1][j-1] + grid[i-1][j+1] != 10){
            return false;
        }
        if(grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] != 15){
            return false;
        }
        if(grid[i][j-1] + grid[i][j] + grid[i][j+1] != 15){
            return false;
        }
        if(grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1] != 15){
            return false;
        }
        if(grid[i-1][j-1] + grid[i][j-1] + grid[i+1][j-1] != 15){
            return false;
        }
        if(grid[i-1][j] + grid[i][j] + grid[i+1][j] != 15){
            return false;
        }
        if(grid[i-1][j+1] + grid[i][j+1] + grid[i+1][j+1] != 15){
            return false;
        }
        return true;
    }
}
