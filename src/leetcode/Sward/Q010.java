package leetcode.Sward;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/17 19:40
 * @description :
 * 地上有一个 m 行和 n 列的方格。一个机器人从坐标
 * (0, 0) 的格子开始移动，每一次只能向左右上下四个
 * 方向移动一格，但是不能进入行坐标和列坐标的数位之
 * 和大于 k 的格子。
 *
 * 例如，当 k 为 18 时，机器人能够进入方格 (35,37)，
 * 因为 3+5+3+7=18。但是，它不能进入方格 (35,38)，
 * 因为 3+5+3+8=19。请问该机器人能够达到多少个格子？
 *
 * dfs
 */
public class Q010 {
    private int[][] digitSum;
    private int cnt = 0;
    private int cols;
    private int rows;
    private int threshold;
    private final static int[][] next = {{1,0},{-1,0},{0,1},{0,-1}};

    public int movingCount(int threshold,int rows,int cols){
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        initDigitSum();
        boolean[][] marked = new boolean[rows][cols];
        dfs(marked,0,0);
        return cnt;
    }

    private void dfs(boolean[][] marked,int r,int c){
        if(r < 0 || r >= rows || c <0 || c >= cols || marked[r][c]){
            return;
        }
        marked[r][c] = true;
        if(this.digitSum[r][c] > this.threshold){
            return;
        }
        cnt ++;
        for(int[] n : next){
            dfs(marked,r + n[0],c + n[1]);
        }
    }

    private void initDigitSum(){
        int[] digitSumOne = new int[Math.max(rows,cols)];
        for(int i = 0;i < digitSumOne.length;i ++){
            int n = i;
            while(n > 0){
                digitSumOne[i] += n % 10;
                n /= 10;
            }
        }
        this.digitSum = new int[rows][cols];
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                digitSum[i][j] = digitSumOne[i] + digitSumOne[j];
            }
        }
    }
}
