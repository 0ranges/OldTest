package leetcode.medium;

/**
 * Created by user on 2018/4/16.
 */
public class Q647 {
    public int countSubstrings(String s) {
        int n = s.length();
        int res = n;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<n-i;j++){
                int lo = j;
                int hi = j+i;
                int count = 0;
                while(lo<hi&&s.charAt(lo++) == s.charAt(hi--))
                    count++;
                if(count == (i+1)/2)
                    res++;
            }
        }
        return res;
    }
}
