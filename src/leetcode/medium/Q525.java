package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2018/8/15.
 */
public class Q525 {
    public static void main(String[] args) {
        System.out.println(findMaxLength(new int[]{0, 1}));
    }

    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] res = new int[n + 1];
        for (int i = 0; i < n; i++) {
            res[i + 1] = res[i];
            res[i + 1] += nums[i];
        }
        for (int i = n; i >= 0; i--)
            if (i % 2 == 0) {
                for (int j = 0; j + i <= n; j++) {
                    if (res[j + i] - res[j] == n / 2)
                        return i;
                }
            }
        return 0;
    }

    public int findMaxLength01(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }

        int res = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                res = Math.max(res, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return res;
    }
}

