package Arithmetic.DP;

import java.util.Scanner;

/**
 * Created by user on 2017/5/31.
 */
/*
有一个由1..9组成的数字串.问如果将m个加
号插入到这个数字串中,在各种可能形成的
表达式中，值最小的那个表达式的值是多少
 */
public class Example04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int n = str.length();
        int m = input.nextInt();
        int a[][] = new int[m+1][n];
        for(int i = 0;i<=m;i++){
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    a[i][j] = Integer.parseInt(str.substring(0, j + 1));
                else {
                    int index = Integer.parseInt(str);
                    if(i>=j+1)
                        a[i][j] = index;
                    else {
                        for (int k = 0; k < j ; k++) {
                            int x = a[i - 1][k] + Integer.parseInt(str.substring(k + 1, j+1));
                            if (x < index)
                                index = x;
                        }
                        a[i][j] = index;
                    }
                }
            }
        }
        for(int i = 0 ;i<=m;i++){
            for(int j = 0;j<n;j++){
                if(i!=0&&a[i][j] == Integer.parseInt(str))
                    System.out.print("-"+"\t");
                else
                    System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
