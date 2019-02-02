package leetcode.medium;

import java.util.*;

/**
 * Created by user on 2017/12/14.
 */
public class Q090 {
    public List<List<Integer>> subsetsWithDup01(int[] nums) {
        if(nums.length == 0||nums == null)
            return new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int size = 0;
        int index = 0;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i = 0;i<nums.length;i++){
            index = i>=1&&nums[i]==nums[i-1]?size:0;
            size = result.size();
            for(int j = index;j<size;j++){
                List list = new ArrayList(result.get(j));
                list.add(nums[i]);
                result.add(list);
            }
        }
        return result;
    }
    public List<List<Integer>> subsetsWithDup02(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,0,temp,result);
        return result;
    }
    void dfs(int[] nums,int start,List<Integer> temp,List<List<Integer>> result){
        result.add(temp);
        for(int i = start;i<nums.length;i++){
            temp.add(nums[i]);
            dfs(nums,start+1,temp,result);
            temp.remove(temp.size()-1);
            while(nums[i] == nums[i+1])
                i++;
        }
    }
}
