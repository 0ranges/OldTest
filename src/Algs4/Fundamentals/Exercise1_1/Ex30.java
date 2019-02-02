package Algs4.Fundamentals.Exercise1_1;

/**
 * Created by user on 2017/11/15.
 */
public class Ex30 {
    public static boolean isValid(int a,int b){
        if(b>a){
            int t = a;
            a = b;
            b = t;
        }
        if(b == 1)
            return false;
        else if(a%b == 0)
            return true;
        else
            return isValid(b,a%b);
    }

    public static void main(String[] args) {
        boolean[][] a = new boolean[10][10];
        for(int i = 1;i<10;i++){
            for(int j = 1;j<10;j++){
                a[i][j] = isValid(i,j);
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
