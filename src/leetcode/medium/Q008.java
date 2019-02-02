package leetcode.medium;

/**
 * Created by user on 2018/3/10.
 */
public class Q008 {
    public static void main(String[] args) {
        System.out.println(myAtoi("123"));
    }
    public static int myAtoi(String str) {
        str = str.trim();
        if(str.length() == 0)
            return 0;
        char[] c = str.toCharArray();
        int judge = 1;
        int index = 0;
        if(c[0] == '+') {
            judge = 1;
            index = 1;
        }
        else if(c[0] == '-') {
            judge = -1;
            index = 1;
        }
        int n = index;
        for(int i = index;i<c.length;i++){
            n = i+1;
            if(c[i]<'0'||c[i]>'9') {
                n--;
                break;
            }
        }
        if(n-index >10){
            return judge<0?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }else{
            long result = 0;
            for(int i = index;i<n;i++)
                result = 10*result+(c[i]-'0');
            if(result>Integer.MAX_VALUE&&judge>0)
                return Integer.MAX_VALUE;
            else if(result>(long)Integer.MAX_VALUE+1&&judge<0)
                return Integer.MIN_VALUE;
            else
                return judge<0?(0-(int)result):(int)result;
        }
    }
}
