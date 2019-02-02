package leetcode.medium;

/**
 * Created by user on 2018/8/13.
 */
public class Q738 {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(1234));
    }
    public static int monotoneIncreasingDigits(int N) {
        int[] res = new int[10];
        int index = 0;
        while(N > 0){
            res[index++] = N % 10;
            N /= 10;
        }
        int i = index - 1;
        for(;i >= 0;i--){
            if(res[i] < res[i+1])
                break;
        }
            if(i == -1)
                i = 0;
        for(int j = i - 1;j >= 0;j--){
            res[j] = 9;
        }
        for(;i < index;i++){
            if(res[i] < res[i+1]) {
                res[i] = 9;
                res[i+1]--;
            }else{
                break;
            }
        }
        int result = 0;
        int x = 1;
        for(int k : res){
            result += k * x;
            x *= 10;
        }
        return result;
    }
}
