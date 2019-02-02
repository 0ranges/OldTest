package leetcode.medium;

/**
 * @author : oranges
 * @date : 2018/8/23 10:25
 */
public class Q274 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] res = new int[n + 1];
        for(int i : citations){
            int j = i > n ? n : i;
            for(;j >= 0;j--){
                res[j] ++;
            }
        }
        for(int i = n; i >= 0;i--){
            if(res[i] >= i){
                return i;
            }
        }
        return 0;
    }
}
