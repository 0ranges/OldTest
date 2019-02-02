package CodeM;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * Created by user on 2018/8/1.
 */
public class ALiTest {
    public static void main(String[] args) {
        int[][] army = {{34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,10, 0, 0, 0,30},
                        { 0,23,10, 5, 5, 0, 0, 0, 5, 5, 5, 5, 5, 0, 0, 0,30, 0,40, 0},
                        { 0, 9, 0, 0, 5, 0, 0, 0, 4, 4, 4, 4, 4, 0, 0, 0, 0,30, 0, 0},
                        { 0, 8, 7, 7, 0, 5, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 7, 0, 9, 0},
                        { 0, 9, 0, 0, 5, 0, 5, 0, 0,12,12, 0, 0, 0, 0,10, 0, 0, 0, 9},
                        { 0, 0, 0, 0, 5, 0, 0, 5, 0,12,12, 0, 0, 5, 0, 0, 0, 0, 0, 0},
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0,12,12, 0, 0, 5, 0, 0, 0, 0, 0, 0},
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0},
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0},
                        {30,40, 3, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 0,10, 0},
                        { 0, 0,20, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 5, 6, 5,10,10, 0},
                        {30,40, 3, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0,10, 0},
                        { 0, 0, 0, 0, 0, 0, 0,17, 0, 0, 0, 0,17, 0, 0, 6, 5, 7, 7, 0},
                        { 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0},
                        { 0,20, 0, 0, 7, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0,10, 0, 0, 0},
                        { 0,20, 0, 0, 7, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0,10, 0, 0, 0},
                        { 0,20, 0, 0, 7, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0,10, 0, 0, 0},
                        { 0,30, 0, 7, 0, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0,10, 0,50},
                        { 0,40, 7, 0, 0, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0,50, 0},
                        {43,30,25,10,50, 0, 0, 0, 6, 6, 6, 6, 0, 0, 0, 0, 0,50, 0, 0},};
        baGuaZhen(army);
    }
    public static void baGuaZhen(int[][] army){
        int[] res = new int[8];
        int index = 0;
        boolean[][] judge = new boolean[army.length][army[0].length];
        for(boolean[] j : judge)
            Arrays.fill(j,false);
        for(int i = 0;i<army.length;i++){
            for(int j = 0;j<army[0].length;j++){
                if(army[i][j]>0&&!judge[i][j]) {
                    res[index++] = search(i, j, army, judge);
                }
            }
        }
        for(int i:res)
            System.out.println(i);
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
                if(j - 1 >= 0 && !judge[i - 1][j - 1] && army[i - 1][j - 1] > 0){
                    queue.add((i - 1) * n + j - 1);
                    judge[i - 1][j - 1] = true;
                }
                if(j + 1 < n && !judge[i - 1][j + 1] && army[i - 1][j + 1] > 0){
                    queue.add((i - 1) * n + j + 1);
                    judge[i - 1][j + 1] = true;
                }
            }
            if(i + 1 < army.length){
                if(!judge[i + 1][j] && army[i + 1][j] > 0) {
                    queue.add((i + 1) * n + j);
                    judge[i + 1][j] = true;
                }
                if(j - 1 >= 0 && !judge[i + 1][j - 1] && army[i + 1][j - 1] > 0){
                    queue.add((i + 1) * n + j - 1);
                    judge[i + 1][j - 1] = true;
                }
                if(j + 1 < n && !judge[i + 1][j + 1] && army[i + 1][j + 1] > 0){
                    queue.add((i + 1) * n + j + 1);
                    judge[i + 1][j + 1] = true;
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
