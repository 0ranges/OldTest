package leetcode.medium;

/**
 * Created by user on 2018/8/21.
 */
public class Q365 {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        if(z > y + x)
            return false;
        if(x == 0)
            return y == z || z == 0;
        boolean[] res = new boolean[x + 1];
        res[0] = true;
        res[x] = true;
        int y_ = y;
        int index = y_ % x;
        while(!res[index]){
            res[index % x] = true;
            y_ = y - (x - index);
            index = y_ % x;
        }
        return res[z % x];
    }
}
