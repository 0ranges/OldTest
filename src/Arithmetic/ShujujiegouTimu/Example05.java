package Arithmetic.ShujujiegouTimu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2017/4/23.
 */
/*
黑白图像
输入一个n*n的黑白图像（1表示黑色，0表示白色），任务是统计其中八连块的个数。
如果两个黑格子有公共边或者公共顶点，就说他们属于同一个八连块
例子：
输入：
1 0 0 1 0 0
0 0 1 0 1 0
0 0 0 0 0 0
1 1 0 0 0 0
1 1 1 0 0 0
0 1 0 1 0 0
输出：
3
 */
public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean mat[][] = new boolean[n+2][n+2];
        boolean vis[][] = new boolean[n+2][n+2];
        for(int i = 0;i<n+2;i++){
            for(int j = 0;j<n+2;j++){
                mat[i][j] = false;
                vis[i][j] = false;
            }
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                int x = input.nextInt();
                if(x == 1){
                    mat[i][j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(!vis[i][j]&&mat[i][j]){
                    count++;
                    dfs(mat,vis,i,j);
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(boolean mat[][],boolean vis[][],int x,int y){
        if(!mat[x][y]||vis[x][y]){
            return;
        }
        vis[x][y] = true;
        dfs(mat,vis,x-1,y-1);
        dfs(mat,vis,x,y-1);
        dfs(mat,vis,x+1,y-1);
        dfs(mat,vis,x-1,y);
        dfs(mat,vis,x+1,y);
        dfs(mat,vis,x-1,y+1);
        dfs(mat,vis,x,y+1);
        dfs(mat,vis,x+1,y+1);
    }
}
