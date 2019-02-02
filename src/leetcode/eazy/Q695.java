package leetcode.eazy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * Created by user on 2018/8/3.
 */
/*
public int maxAreaOfIsland(int[][] grid) {
        int i,j,temp,result=0;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    temp=countArea(grid,i,j);
                    result=Math.max(temp,result);
                }
            }
        }
        return result;
    }

     public int countArea(int [][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=1) return 0;

         grid[i][j]=0;
            return 1+countArea(grid,i+1,j)+countArea(grid,i-1,j)+countArea(grid,i,j+1)+countArea(grid,i,j-1);
    }


    比较简单 不必使用queue进行BFS


 */
public class Q695 {
    public static void main(String[] args) {
        System.out.println(maxAreaOfIsland(new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}}));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        boolean[][] judge = new boolean[grid.length][grid[0].length];
        for(boolean[] j : judge)
            Arrays.fill(j,false);
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]>0&&!judge[i][j]) {
                    res = Math.max(search(i, j, grid, judge),res);
                }
            }
        }
        return res;
    }
    public static int search(int i,int j,int[][] army,boolean[][] judge){
        int res = 0;
        int n = army[0].length;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(i*n+j);
        judge[i][j] = true;
        while(!queue.isEmpty()){
            int pos = queue.poll();
            i = pos / n;
            j = pos % n;
            res += army[i][j];
            if(i - 1 >= 0){
                if(!judge[i - 1][j] && army[i - 1][j] > 0) {
                    queue.add((i - 1) * n + j);
                    judge[i - 1][j] = true;
                }
            }
            if(i + 1 < army.length){
                if(!judge[i + 1][j] && army[i + 1][j] > 0) {
                    queue.add((i + 1) * n + j);
                    judge[i + 1][j] = true;
                }
            }
            if(j - 1 >= 0 && !judge[i][j - 1] && army[i][j - 1] > 0){
                queue.add(i * n + j - 1);
                judge[i][j - 1] = true;
            }
            if(j + 1 < n && !judge[i][j + 1] && army[i][j + 1] > 0){
                queue.add(i * n + j + 1);
                judge[i][j + 1] = true;
            }
        }
        return res;
    }


}
