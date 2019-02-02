package leetcode.eazy;

/**
 * Created by user on 2018/4/23.
 */
public class Q492 {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        for(int i = area;i>=Math.sqrt(area);i--){
            if(area % i == 0){
                res[0] = i;
                res[1] = area/i;
            }
        }
        return res;
    }
}
