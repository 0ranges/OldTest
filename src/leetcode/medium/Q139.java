package leetcode.medium;

import java.util.List;

/**
 * Created by user on 2017/9/8.
 */
public class Q139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean all[] = new boolean[s.length()+1];
        all[0] = true;
        for(int i = 1;i<=s.length();i++){
            for(int j = 0;j<i;j++){
                if(all[j]&&wordDict.contains(s.substring(j,i))){
                    all[i] = true;
                    break;
                }
            }
        }
        return all[s.length()];
    }
}
