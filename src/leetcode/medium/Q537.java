package leetcode.medium;

/**
 * Created by user on 2018/4/17.
 */
public class Q537 {
    public String complexNumberMultiply(String a, String b) {
        int a_index = a.indexOf("+");
        int a_1 = Integer.parseInt(a.substring(0,a_index));
        int a_2 = Integer.parseInt(a.substring(a_index+1,a.length()-1));
        int b_index = b.indexOf("+");
        int b_1 = Integer.parseInt(b.substring(0,b_index));
        int b_2 = Integer.parseInt(b.substring(b_index+1,b.length()-1));
        int c_1 = a_1*b_1-a_2*b_2;
        int c_2 = a_1*b_2+a_2*b_1;
        return c_1+"+"+c_2+"i";
    }
}
