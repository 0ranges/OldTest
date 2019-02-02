package leetcode.medium;

/**
 * Created by user on 2018/8/10.
 */
public class Q043 {
    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2))
            return "0";
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int[] res = new int[c1.length + c2.length];
        for(int i = c2.length-1 ;i >= 0;i--){
            for(int j = c1.length-1;j >= 0;j--){
                int a = (c2[i]-'0')*(c1[j]-'0');
                int lo = res[i+j+1];
                int hi = res[i+j];
                lo += a;
                hi += lo / 10;
                lo %= 10;
                res[i+j+1] = lo;
                res[i+j] = hi;
            }
        }
        String result = "";
        for(int i:res)
            result += i;
        return res[0] == 0?result.substring(1):result;
    }
}
