package Arithmetic.DP;

/**
 * Created by user on 2017/5/30.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 动态规划
 *
 7
 3 8
 8 1 0
 2 7 4 4
 4 5 2 6 5
 在上面的数字三角形中寻找一条从顶部到底边的路径，使得
 路径上所经过的数字之和最大。路径上的每一步都只能往左下或
 右下走。只需要求出这个最大和即可，不必给出具体路径。
 三角形的行数大于1小于等于100，数字为 0 - 99

 5 //三角形行数。下面是三角形
 7
 3 8
 8 1 0
 2 7 4 4
 4 5 2 6 5
 要求输出最大和
 */
public class Example01 {
    public static int maxnum[][] = new int[100][100];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                a[i][j] = input.nextInt();
                maxnum[i][j] = -1;
            }
        }
        //System.out.println(dp(a,0,0));         递归求解
//递推求解
//        for(int i = n-1;i>=0;i--){
//            for(int j=i;j>=0;j--){
//                if(i == n-1)
//                    maxnum[i][j] = a[i][j];
//                else {
//                    int x = maxnum[i+1][j];
//                    int y = maxnum[i+1][j+1];
//                    maxnum[i][j] = Math.max(x,y)+a[i][j];
//                }
//            }
//        }
//        System.out.println(maxnum[0][0]);
//        for(int i = 0;i<n;i++){
//            for(int j = 0;j<=i;j++){
//                System.out.print(maxnum[i][j]+"\t");
//            }
//            System.out.println();
//        }

//递推求解
//用一维数组保存maxnum
        int max[] = new int[100];
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<=i;j++){
                if(i==n-1)
                    max[j] = a[i][j];
                else{
                    max[j] = Math.max(max[j+1],max[j])+a[i][j];
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(max[i]+"\t");
        System.out.println(max[0]);
    }
    public static int dp(int a[][],int i,int j){

        if(i==a.length-1){
            maxnum[i][j] = a[i][j];
        }else{
            int x = dp(a,i+1,j);
            int y = dp(a,i+1,j+1);
            maxnum[i][j] = Math.max(x,y)+a[i][j];
        }
        return maxnum[i][j];
    }
}
