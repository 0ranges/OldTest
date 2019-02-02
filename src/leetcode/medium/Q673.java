package leetcode.medium;

/**
 * Created by user on 2017/9/14.
 */
public class Q673 {
    public static int findNumberOfLIS(int[] nums) {
        int count1[] = new int[nums.length];
        int count2[] = new int[nums.length];
        int n = nums.length;
        if(n == 0)
            return 0;
        count1[0] = 1;
        count2[0] = 1;
        int index = 0;
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                index = 0;
                if(nums[i]>nums[j]&&count1[j]>index) {
                    index = count1[j];
                    count1[i] = index+1;
                    count2[i] = count2[j];
                    continue;
                }
                if(nums[i]>nums[j]&&count1[j] == index)
                    count2[i] += count2[j];
                if(index == 0){
                    count1[i] = 1;
                    count2[i] =1;
                }
            }

        }
        int max = 0;
        int num = 0;
        for(int i = 0;i<n;i++){
            if(count1[i]>max){
                max = count1[i];
                num = count2[i];
            }else if(count1[i] == max)
                num+= count2[i];
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfLIS(new int[]{2,2,2,2,2}));
    }
}
