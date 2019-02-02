package leetcode.hard;

/**
 * Created by user on 2018/4/17.
 */
public class Q084 {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for(int i = 0;i<heights.length;i++){
            if(i>0&&heights[i] == heights[i-1])
                continue;
            int j = i-1;
            int width = 1;
            while(j>=0&&heights[j--]>=heights[i])
                width++;
            j = i+1;
            while(j<heights.length&&heights[j++]>=heights[i])
                width++;
            max = Math.max(max,width*heights[i]);
        }
        return max;
    }
}
