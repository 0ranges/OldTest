package leetcode.eazy;

/**
 * @author : oranges
 * @title : leetcode.eazy
 * @date : 2019/2/28 19:29
 * @description :
 */
public class Q136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums) {
            res ^= i;
        }
        return res;
    }
}
