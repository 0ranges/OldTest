package leetcode.medium;

/**
 * @author : oranges
 * @title : leetcode.medium
 * @date : 2019/2/14 12:01
 * @description :
 */
public class Q209 {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int i = 1;
        while(i <= n){
            int sum = 0;
            for(int j = 0;j < i;j++){
                sum += nums[j];
            }
            if(sum >= s){
                return i;
            }
            for(int j = 0;i + j < n;j++){
                sum += nums[i + j];
                sum -= nums[j];
                if(sum >= s){
                    return i;
                }
            }
            i++;
        }
        return 0;
    }
}
