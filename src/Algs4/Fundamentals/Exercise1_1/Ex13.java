package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/14.
 */
public class Ex13 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int m = a.length;
        int n = a[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++)
                System.out.print(a[j][i]+"\t");
            System.out.println();
        }
    }
}
