package leetcode.hard;

public class Q552 {
    public int checkRecord(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 3;
        }
        int mod = 1000000007;
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        for(int i = 3;i <= n;i ++){
            nums[i] = (nums[i - 1] + nums[i - 2] + nums[i - 3]) % mod;
        }
        int res = nums[n];
        for(int i = 0;i < n;i ++) {
            int t = nums[i] * nums[n - 1 - i] % mod;
            res = (res + t) % mod;
        }
        return res;
    }
}
