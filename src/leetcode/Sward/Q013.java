package leetcode.Sward;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/17 21:07
 * @description :
 * 给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，求 base 的 exponent 次方。
 */
public class Q013 {
    public double Power(double base, int exponent) {
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }
        boolean isNegative = false;
        if(exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base,exponent / 2);
        if(exponent % 2 == 1){
            pow *= base;
        }
        return isNegative ? 1 / pow : pow;
    }
}
