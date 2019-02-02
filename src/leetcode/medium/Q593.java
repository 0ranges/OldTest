package leetcode.medium;

import java.util.Arrays;

/**
 * Created by user on 2018/4/17.
 */
public class Q593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] edge = new int[6];
        edge[0] = (int)Math.pow((p1[0]-p2[0]),2)+(int)Math.pow((p1[1]-p2[1]),2);
        edge[1] = (int)Math.pow((p1[0]-p3[0]),2)+(int)Math.pow((p1[1]-p3[1]),2);
        edge[2] = (int)Math.pow((p1[0]-p4[0]),2)+(int)Math.pow((p1[1]-p4[1]),2);
        edge[3] = (int)Math.pow((p2[0]-p3[0]),2)+(int)Math.pow((p2[1]-p3[1]),2);
        edge[4] = (int)Math.pow((p2[0]-p4[0]),2)+(int)Math.pow((p2[1]-p4[1]),2);
        edge[5] = (int)Math.pow((p3[0]-p4[0]),2)+(int)Math.pow((p3[1]-p4[1]),2);
        Arrays.sort(edge);
        for(int i:edge)
            if(i == 0)
                return false;
        return edge[0]==edge[1]&&edge[1]==edge[2]&&edge[2]==edge[3]&&edge[4]==edge[5]&&edge[0]+edge[1]==edge[4];
    }
}
