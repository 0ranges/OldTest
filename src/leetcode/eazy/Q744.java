package leetcode.eazy;

/**
 * Created by user on 2017/12/17.
 */
public class Q744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo = 0;
        int hi = letters.length-1;
        int mid = 0;
        while(lo<=hi){
            mid = lo+(hi-lo)/2;
            if(target>=letters[mid])
                lo = mid+1;
            else if(target<letters[mid])
                hi = mid-1;
        }
        return letters[(mid+1)%letters.length];
    }
}
