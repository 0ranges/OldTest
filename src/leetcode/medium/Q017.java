package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/3/17.
 */
public class Q017 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0)
            return result;
        String[] a = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String sb = "";
        dfs(result,a,digits,0,sb);
        return result;
    }
    private void dfs(List<String> result,String[] a,String digits,int index,String sb){
        if(index == digits.length())
            result.add(sb);
        else{
            int i = digits.charAt(index)-'0';
            if(i == 1)
                dfs(result,a,digits,index+1,sb);
            else{
                String str = a[i];
                for(int n = 0;n<str.length();n++){
                    sb = sb + str.charAt(n);
                    dfs(result,a,digits,index+1,sb);
                    sb = sb.substring(0,index);
                }
            }
        }
    }
}
