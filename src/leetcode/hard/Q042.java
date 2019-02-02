package leetcode.hard;

/**
 * Created by user on 2018/4/10.
 */
public class Q042 {
    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        int max = height[0];
        int res = 0;
        int maxHeight = 0;
        for(int i = 1;i<height.length;i++){
            if(height[i]>=max){
                for(int j = maxHeight;j<i;j++){
                    res+=max-height[j];
                }
                max = height[i];
                maxHeight = i;
            }
        }
        max = height[height.length-1];
        int anoMaxHeight = height.length-1;
        for(int i = height.length-1;i>=maxHeight;i--){
            if(height[i]>=max){
                for(int j = anoMaxHeight;j>i;j--){
                    res+=max-height[j];
                }
                max = height[i];
                anoMaxHeight = i;
            }
        }
        return res;
    }
}
