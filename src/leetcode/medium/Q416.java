package leetcode.medium;

/**
 * Created by user on 2018/8/6.
 */
public class Q416 {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int i : nums){
            total += i;
        }
        if(total % 2 != 0)
            return false;
        total /= 2;
        boolean[][] res = new boolean[nums.length+1][total+1];
        res[0][0] = true;
        for(int i = 1;i<=nums.length;i++){
            res[i][0] = true;
            for(int j = 1;j<=total;j++){
                res[i][j] = res[i-1][j];
                if(j-nums[i-1] >= 0 && res[i - 1][j-nums[i-1]])
                    res[i][j] = true;
            }
        }
        return res[nums.length][total];
    }
}
