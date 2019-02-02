package CodeM;

import java.util.Arrays;

/**
 * Created by user on 2018/8/13.
 */
public class JRTTTest {
    public static void main(String[] args) {
        int n = 4;
        int[][] points = new int[][]{
                {1,9},
                {3,3},
                {5,7},
                {10,4},
        };
        System.out.println(maxTeamPoint(n,points));
    }
    public static int maxTeamPoint(int n,int[][] points){
        int total = 0;
        for(int[] point : points){
            total += point[0];
        }
        total /= 2;
        int[][][] res = new int[total + 1][total + 1][n+1];
        for(int[][] a : res){
            for(int[] b : a)
                Arrays.fill(b,Integer.MIN_VALUE);
        }
        for(int i = 0;i <= n;i++){
            res[0][0][i] = 0;
        }
        for(int i = 1;i <= n;i++){
            for(int x = 0;x <= total;x++ ){
                for(int y = 0;y <= x;y++){
                    int p_point = points[i-1][0];
                    int t_point = points[i-1][1];
                    if(x >= p_point && y >= p_point){
                        res[x][y][i] = Math.max(res[x-p_point][y][i-1],res[x][y-p_point][i-1]) + t_point;
                        res[x][y][i] = Math.max(res[x][y][i],res[x][y][i-1]);
                    }else if(x >= p_point){
                        res[x][y][i] = Math.max(res[x-p_point][y][i-1] + t_point,res[x][y][i-1]);
                    }
                    else if(y >= p_point){
                        res[x][y][i] = Math.max(res[x][y-p_point][i-1] + t_point,res[x][y][i-1]);
                    }else{
                        res[x][y][i] = res[x][y][i-1];
                    }
                }
            }
        }
        int result = 0;
        for(int i = 0;i <= total;i++){
            if(res[i][i][n] > 0)
                result = Math.max(res[i][i][n],result);
        }
        return result;
    }
}
