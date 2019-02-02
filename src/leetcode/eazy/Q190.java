package leetcode.eazy;

/**
 * Created by user on 2018/4/23.
 */
public class Q190 {
    public static void main(String[] args) {
        System.out.println(reverseBits(1));
    }
    public static int reverseBits(int n) {
        int value = 0;
        for(int i = 0;i<32;i++){
            value = (value<<1)+(n&1);
            n =n>>1;
        }
        return value;
    }
}
