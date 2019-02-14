package leetcode.eazy;

/**
 * @author : oranges
 * @title : leetcode.eazy
 * @date : 2019/2/13 10:30
 * @description :
 */
public class Q443 {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','b','c','c','c','c','c','c'}));
    }
    public static int compress(char[] chars) {
        int index = 0;
        int n = 0;
        int N = chars.length;
        while(n < N){
            int sum = 0;
            for(int j = n;j <= N;j++){
                if(j < N && chars[j] == chars[n]){
                    sum++;
                }else{
                    n = j;
                    chars[index++] = chars[n-1];
                    if(sum != 1){
                        int count = 0;
                        int sum_ = sum;
                        while(sum_ > 0){
                            count ++;
                            sum_ /= 10;
                        }
                        for(int k = index + count - 1;k >= index;k --){
                            chars[k] = (char)('0' + sum % 10);
                            sum /= 10;
                        }
                        index += count;
                    }
                    break;
                }
            }
        }
        return index;
    }
}
