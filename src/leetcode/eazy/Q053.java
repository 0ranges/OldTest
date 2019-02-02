package leetcode.eazy;

/**
 * Created by user on 2017/9/12.
 */
public class Q053 {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int b = 0;
        int sum = nums[0];
        for(int i = 0 ;i<n;i++){
            if(b<0)
                b = nums[i];
            else
                b += nums[i];
            if(b>sum)
                sum = b;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }
}
