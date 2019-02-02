package leetcode.medium;

/**
 * Created by user on 2018/4/2.
 */
public class Q799 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] res = new double[query_row + 1][query_row + 1];
        res[0][0] = poured;
        for (int i = 0; i < query_row; i++) {
            for (int j = 0; j <= query_row; j++) {
                if (res[i][j] > 1.0) {
                    res[i + 1][j] += (res[i][j] - 1.0) / 2;
                    res[i + 1][j + 1] += (res[i][j] - 1.0) / 2;
                }
            }
        }
        return res[query_row][query_glass] > 1.0 ? 1.0 : res[query_row][query_glass];
    }
}
