package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex27 {
    private static long count1 = 0;
    private static long count2 = 0;
    private static double[][] record;

    public static void main(String[] args) {
        System.out.println("result: " + binomial(20, 10, 0.25) + ", count: " + count1);
        System.out.println("result: " + betterBinomial(20, 10, 0.25) + ", count: " + count2);

    }
    public static double binomial(int N, int k, double p) {
        count1++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }
    private static double bin(int N, int k, double p) {
        count2++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        if (record[N][k] == -1) {
            record[N][k] = (1.0 - p) * bin(N - 1, k, p) + p * bin(N - 1, k - 1, p);
        }
        return record[N][k];
    }

    public static double betterBinomial(int N, int k, double p) {
        record = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                record[i][j] = -1;
            }
        }
        return bin(N, k, p);
    }

}
