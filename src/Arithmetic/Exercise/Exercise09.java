package Arithmetic.Exercise;

/**
 * Created by user on 2017/5/17.
 */

import java.util.Scanner;

/**
 * 数独
 * 0 0 0 6 0 0 4 0 0
 0 0 0 1 8 0 3 0 2
 7 8 0 4 2 0 5 0 0
 2 0 0 0 0 0 8 9 4
 5 0 0 0 9 0 0 6 0
 6 9 8 0 0 0 0 0 7
 0 0 1 0 6 5 0 4 8
 8 0 5 0 4 2 0 0 0
 0 0 4 0 0 1 7 0 0


 0 0 1 0 0 0 5 0 0
 5 9 0 0 0 0 0 6 4
 0 0 8 0 0 0 2 0 0
 0 1 0 3 8 0 0 0 0
 2 3 0 4 0 0 0 0 0
 8 0 0 0 1 0 0 9 0
 0 4 0 0 2 0 0 0 7
 0 0 0 0 0 5 0 2 6
 0 0 0 0 7 1 0 3 0
 4  6  1  2  9  8  5  7  3
 5  9  2  1  3  7  8  6  4
 3  7  8  5  6  4  2  1  9
 6  1  9  3  8  2  7  4  5
 2  3  7  4  5  9  6  8  1
 8  5  4  7  1  6  3  9  2
 1  4  6  8  2  3  9  5  7
 7  8  3  9  4  5  1  2  6
 9  2  5  6  7  1  4  3  8
 */
public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[][] = new int[9][9];
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                a[i][j] = input.nextInt();
            }
        }
        print(0,0,a);
    }
    public static void print(int i,int j,int a[][]){
        if(i==9){
            for(int c = 0;c<9;c++){
                for(int b = 0;b<9;b++){
                    System.out.print(a[c][b]+"  ");
                }
                System.out.println();
            }
        }else {
            if (a[i][j] == 0) {
                for (int m = 1; m <= 9; m++) {
                    if (judge(i,j,m,a)){
                        a[i][j] = m;
                        if (j == 8) {
                            print(i + 1, 0, a);
                        } else {
                            print(i, j + 1, a);
                        }
                        a[i][j] = 0;
                    }
                }
            } else {
                if (j == 8) {
                    print(i + 1, 0, a);
                } else {
                    print(i, j + 1, a);
                }
            }
        }
    }
    public static boolean judge(int i,int j,int count,int a[][]){
        for(int x = 0;x<9;x++)if(x!=i){
            if(a[x][j] == count)
                return false;
        }
        for(int y = 0;y<9;y++)if(y!=j){
            if(a[i][y] == count)
                return false;
        }
        int n = i/3*3;
        int m = j/3*3;
        for(int x = n;x<n+3;x++){
            for(int y =m;y<m+3;y++){
                if(x!=i&&y!=i){
                    if(a[x][y] == count)
                        return false;
                }
            }
        }
        return true;
    }
}
