package leetcode.eazy;

import java.util.Arrays;

/**
 * Created by user on 2017/10/10.
 */
public class Q455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int len1 = g.length;
        int len2 = s.length;
        int index_1 = 0;
        int index_2 = 0;
        while(index_1<len1&&index_2<len2){
            if(g[index_1]<=s[index_2]){
                index_1++;
                index_2++;
            }else{
                index_2++;
            }
        }
        return index_1;
    }
}
