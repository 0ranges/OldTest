package leetcode.eazy;

/**
 * Created by user on 2018/5/26.
 */
public class Q836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return Math.max(rec1[2],rec2[2])-Math.min(rec1[0],rec2[0])-(rec2[2]-rec2[0])<(rec1[2]-rec1[0])&&Math.max(rec1[3],rec2[3])-Math.min(rec1[1],rec2[1])-(rec2[3]-rec2[1])<(rec1[3]-rec1[1]);
    }
}
