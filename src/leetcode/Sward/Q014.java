package leetcode.Sward;

/**
 * @author : oranges
 * @title : leetcode.Sward
 * @date : 2019/2/18 14:13
 * @description :
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
 *
 * 由于 n 可能会非常大，因此不能直接用 int 表示数字，
 * 而是用 char 数组进行存储。
 */
public class Q014 {
    public void print1ToMaxOfNDigits(int n) {
        if(n <= 0){
            return;
        }
        char[] nums = new char[n];
        print1ToMaxOfDigits(nums,0);
    }
    private void print1ToMaxOfDigits(char[] nums,int digit){
        if(digit == nums.length){
            printNumber(nums);
            return;
        }
        for(int i = 0;i < 10;i++){
            nums[digit] = (char)('0' + i);
            print1ToMaxOfDigits(nums,digit + 1);
        }
    }
    private void printNumber(char[] nums){
        int index = 0;
        while(index < nums.length && nums[index] == '0'){
            index ++;
        }
        while (index < nums.length) {
            System.out.print(nums[index]);
        }
        System.out.println();
    }
}
