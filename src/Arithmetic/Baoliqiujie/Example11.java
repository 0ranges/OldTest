package Arithmetic.Baoliqiujie;

/**
 * Created by user on 2017/5/15.
 */
/*
八皇后
二维数组
success
 */
public class Example11 {
    public static int num = 0;

    public static void main(String[] args) {
        int a[][] = new int[3][15];
        search(0,a);
        System.out.println(num);
    }
    public static void search(int n,int a[][]){
        if(n==8){
            num++;
        } else{
            for(int i = 0;i<8;i++){
                if(a[0][i] == 0&&a[1][n+i] == 0 && a[2][n-i+7]==0){
                    a[0][i] = 1;
                    a[1][n+i] = 1;
                    a[2][n-i+7] = 1;
                    search(n+1,a);
                    a[0][i] = 0;
                    a[1][n+i] = 0;
                    a[2][n-i+7] = 0;
                }
            }
        }
    }
}
