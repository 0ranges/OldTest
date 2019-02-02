package leetcode.eazy;

/**
 * Created by user on 2018/2/26.
 */
public class Q067 {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int index = 0;
        StringBuilder str = new StringBuilder();
        while(i>=0||j>=0){
            int sum = index;
            if(i>=0)
                sum += a.charAt(i--)-'0';
            if(j>=0)
                sum += b.charAt(j--)-'0';
            str.append(sum%2);
            index = sum/2;
        }
        if(index != 0)
            str.append(index);
        return str.reverse().toString();
    }
}
