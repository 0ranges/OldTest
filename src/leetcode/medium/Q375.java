package leetcode.medium;

/**
 * Created by user on 2017/12/20.
 */
public class Q375 {
    public int getMoneyAmount(int n) {
        int[][] data = new int[1+n][1+n];
        return search(data,1,n);
    }
    int search(int[][] data,int l,int r){
        if(l >= r)
            return 0;
        if(data[l][r]!=0)
            return data[l][r];
        int min = Integer.MAX_VALUE;
        for(int i = l;i<=r;i++){
            min = Math.min(min,i+Math.max(search(data,l,i-1),search(data,i+1,r)));
        }
        data[l][r] = min;
        return min;
    }
}
