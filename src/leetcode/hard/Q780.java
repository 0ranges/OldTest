package leetcode.hard;

/**
 * @author : oranges
 * @date : 2018/9/20 17:42
 */
public class Q780 {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        return search(sx,sy,tx,ty);
    }
    public boolean search(int sx,int sy,int tx,int ty){
        if(sx > tx || sy > ty){
            return false;
        }
        if(sx == tx && sx == ty){
            return true;
        }
        return reachingPoints(sx,sx+sy,tx,ty) || reachingPoints(sx+sy,sy,tx,ty);
    }
}
