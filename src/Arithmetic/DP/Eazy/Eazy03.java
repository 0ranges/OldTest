package Arithmetic.DP.Eazy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2017/9/11.
 */
/*

四个角递推

题目意思：

给n*m的矩阵，每个格子有个数，A从(1,1)出发只能向下或右走，终点为(n,m)，B从(n,1)出发只能向上或右走，终点为(1,m)。两个人的速度不一样，走到的格子可以获的该格子的数，两人相遇的格子上的数两个人都不能拿。求A和B能拿到的数的总和的最大值。

n,m<=1000

解题思路：

dp.

先预处理出每个格子到四个角落格子的路径最大数值，然后枚举两个人相遇的交点格子，枚举A、B的进来和出去方式，求最大值即可。

注意边界情况。
 */
public class Eazy03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input. nextInt();
        int m = input.nextInt();
        int num[][] = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++)
                num[i][j] = input.nextInt();
        }
        int index = 0;
        for(int i = 1;i<n-1;i++){
            for(int j = 1;j<m-1;j++){
                int num_1[][] = new int[n][m];
                for(int x = 0;x<n;x++){
                    for(int y = 0;y<m;y++)
                        num_1[x][y] = num[x][y];
                }
                index = Math.max(index,max(i,j,num_1));
            }
        }
        System.out.println(index);
    }
    public static int max(int i,int j,int num[][]){
        int lenX = num.length;
        int lenY = num[0].length;
        int num_1[][] = new int[lenX][lenY];
        for(int x = 0;x<lenX;x++){
            for(int y = 0;y<lenY;y++)
                num_1[x][y] = num[x][y];
        }
        for(int x = 0;x<=i-1;x++){
            for(int y = 0;y<=j;y++){
                if(x==0&&y==0)
                    continue;
                else if(x == 0)
                    num[x][y] += num[x][y-1];
                else if(y == 0)
                    num[x][y] += num[x-1][y];
                else
                    num[x][y] = Math.max(num[x-1][y],num[x][y-1])+num[x][y];
            }
        }
        for(int x = i+1;x<lenX;x++){
            for(int y = j;y<lenY;y++){
                if(x==i+1&&y==j)
                    continue;
                else if(x == i+1)
                    num[x][y] += num[x][y-1];
                else if(y == j)
                    num[x][y] += num[x-1][y];
                else
                    num[x][y] = Math.max(num[x-1][y],num[x][y-1])+num[x][y];
            }
        }
        for(int x = lenX-1;x>=i;x--){
            for(int y = 0;y<=j-1;y++){
                if(x==lenX-1&&y==0)
                    continue;
                else if(x == lenX-1)
                    num[x][y] += num[x][y-1];
                else if(y == 0)
                    num[x][y] += num[x+1][y];
                else
                    num[x][y] = Math.max(num[x+1][y],num[x][y-1])+num[x][y];
            }
        }
        for(int x = i;x>=0;x--){
            for(int y = j+1;y<lenY;y++){
                if(x==i&&y==j+1)
                    continue;
                else if(x == i)
                    num[x][y] += num[x][y-1];
                else if(y == j+1)
                    num[x][y] += num[x+1][y];
                else
                    num[x][y] = Math.max(num[x+1][y],num[x][y-1])+num[x][y];
            }
        }
        int all1 = num[i-1][j]+num[i][j-1]+num[0][lenY-1]+num[lenX-1][lenY-1];

        for(int x = 0;x<=i;x++){
            for(int y = 0;y<=j-1;y++){
                if(x==0&&y==0)
                    continue;
                else if(x == 0)
                    num_1[x][y] += num_1[x][y-1];
                else if(y == 0)
                    num_1[x][y] += num_1[x-1][y];
                else
                    num_1[x][y] = Math.max(num_1[x-1][y],num_1[x][y-1])+num_1[x][y];
            }
        }
        for(int x = i;x<lenX;x++){
            for(int y = j+1;y<lenY;y++){
                if(x==i&&y==j+1)
                    continue;
                else if(x == i)
                    num_1[x][y] += num_1[x][y-1];
                else if(y == j+1)
                    num_1[x][y] += num_1[x-1][y];
                else
                    num_1[x][y] = Math.max(num_1[x-1][y],num_1[x][y-1])+num_1[x][y];
            }
        }
        for(int x = lenX-1;x>=i+1;x--){
            for(int y = 0;y<=j;y++){
                if(x==lenX-1&&y==0)
                    continue;
                else if(x == lenX-1)
                    num_1[x][y] += num_1[x][y-1];
                else if(y == 0)
                    num_1[x][y] += num_1[x+1][y];
                else
                    num_1[x][y] = Math.max(num_1[x+1][y],num_1[x][y-1])+num_1[x][y];
            }
        }
        for(int x = i-1;x>=0;x--){
            for(int y = j;y<lenY;y++){
                if(x==i-1&&y==j)
                    continue;
                else if(x == i-1)
                    num_1[x][y] += num_1[x][y-1];
                else if(y == j)
                    num_1[x][y] += num_1[x+1][y];
                else
                    num_1[x][y] = Math.max(num_1[x+1][y],num_1[x][y-1])+num_1[x][y];
            }
        }
        int all01 = num_1[i-1][j]+num_1[i][j-1]+num_1[0][lenY-1]+num_1[lenX-1][lenY-1];
        return Math.max(all01,all1);
    }
}
