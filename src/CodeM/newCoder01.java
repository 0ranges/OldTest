package CodeM;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2018/8/2.
 */
public class newCoder01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = input.nextInt();
        int[] num = new int[n];
        for(int i = 0 ;i<n;i++){
            num[i] = input.nextInt();
        }
        Arrays.sort(num);
        long[][] res = new long[n+1][sum+1];
        res[0][0] = 1;
        int index = n+1;
        for(int i = 1;i<=n;i++){
            if(num[i-1]>sum) {
                index = i;
                break;
            }
            for(int j = 0;j<=sum;j++){
                res[i][j] = res[i-1][j];
                if(j>=num[i-1])
                    res[i][j] += res[i-1][j-num[i-1]];
            }
        }
        System.out.println(res[index-1][sum]);
    }
}
