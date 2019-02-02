package leetcode.eazy;

/**
 * Created by user on 2018/8/10.
 */
public class Q038 {
    public String countAndSay(int n) {
        String res = "1";
        String str = "";
        int count = 1;
        while(n > 1){
            count = 1;
            for(int i = 1;i<res.length();i++){
                if(res.charAt(i) == res.charAt(i-1))
                    count++;
                else{
                    str += count + "" +res.charAt(i-1);
                    count = 1;
                }
            }
            str += count + "" + res.charAt(res.length()-1);
            res = str;
            str = "";
            n--;
        }
        return res;
    }
}
