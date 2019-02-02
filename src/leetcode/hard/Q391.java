package leetcode.hard;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by user on 2017/9/20.
 */
public class Q391 {
    public static boolean isRectangleCover(int[][] rectangles) {
        if(rectangles.length<1)
            return false;
        int minX = rectangles[0][0];
        int minY = rectangles[0][1];
        int maxX = rectangles[0][2];
        int maxY = rectangles[0][3];
        HashSet<String> set = new HashSet<>();
        int size = 0;
        for(int rect[]:rectangles){
            minX = Math.min(rect[0],minX);
            minY = Math.min(rect[1],minY);
            maxX = Math.max(rect[2],maxX);
            maxY = Math.max(rect[3],maxY);
            String str1 = rect[0]+" "+rect[1];
            String str2 = rect[0]+" "+rect[3];
            String str3 = rect[2]+" "+rect[1];
            String str4 = rect[2]+" "+rect[3];
            size += (rect[2]-rect[0])*(rect[3]-rect[1]);
            if(!set.add(str1))
                set.remove(str1);
            if(!set.add(str2))
                set.remove(str2);
            if(!set.add(str3))
                set.remove(str3);
            if(!set.add(str4))
                set.remove(str4);
        }
        if(!set.contains(minX+" "+maxY)||!set.contains(minX+" "+minY)||!set.contains(maxX+" "+maxY)||
                !set.contains(maxX+" "+minY)||set.size()!=4)
            return false;
        else if(size != (maxX-minX)*(maxY-minY))
            return false;
        return true;
    }

    public static void main(String[] args) {
        int a[][] = {{0,0,4,1},{7,0,8,2},{5,1,6,3},{6,0,7,2},{4,0,5,1},{4,2,5,3},{2,1,4,3},{-1,2,2,3},{0,1,2,2},{6,2,8,3},{5,0,6,1},{4,1,5,2}};
        System.out.println(isRectangleCover(a));
    }
}
