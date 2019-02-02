package leetcode.medium;

/**
 * Created by user on 2018/8/22.
 */
public class Q011 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while(i < j){
            res = Math.max(res , (j - i) * Math.min(height[i],height[j]));
            if(height[i] > height[j]) {
                j--;
            }else{
                i++;
            }
        }
        return res;
    }
}
