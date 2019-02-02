package leetcode.eazy;

/**
 * Created by user on 2018/4/2.
 */
public class Q167 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,3,4},6));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int[] res = new int[2];
        while(i<j){
            if(numbers[i]+numbers[j]<target)
                i++;
            else if(numbers[i]+numbers[j]>target)
                j--;
            else{
                res[0] = i;
                res[1] = j;
                break;
            }
        }
        return res;
    }
}
