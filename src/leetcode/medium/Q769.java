package leetcode.medium;

/**
 * Created by user on 2018/4/12.
 */
public class Q769 {
    public int maxChunksToSorted(int[] arr) {
        int res = 0;
        int n = 0;
        while(n<arr.length){
            for(int i = n;i<=arr[n];i++)
                if(arr[i]>arr[n])
                    n = i;
            res++;
            n = arr[n]+1;
        }
        return res;
    }
}
