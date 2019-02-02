package leetcode.medium;

import java.util.*;

/**
 * Created by user on 2018/4/2.
 */
public class Q018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer,List<Integer[]>> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int sum = nums[i]+nums[j];
                Integer[] arr = {nums[i],i,nums[j],j};
                if(!map.containsKey(sum))
                    map.put(sum,new ArrayList<>());
                map.get(sum).add(arr);
            }
        }
        Integer[] keys = map.keySet().toArray(new Integer[map.size()]);
        for(int key:keys){
            if(map.containsKey(key)){
                if(map.containsKey(target-key)){
                    List<Integer[]> first_list = map.get(key);
                    List<Integer[]> second_list = map.get(target-key);
                    for(int i = 0;i<first_list.size();i++){
                        Integer[] first = first_list.get(i);
                        for(int j = 0;j<second_list.size();j++){
                            Integer[] second = second_list.get(j);
                            if(first[1]!=second[1]&&first[1]!=second[3]&&first[3]!=second[1]&&first[3]!=second[3]){
                                List<Integer> list = Arrays.asList(first[0],first[2],second[0],second[2]);
                                Collections.sort(list);
                                if(!res.contains(list))
                                    res.add(list);
                            }
                        }
                    }
                    map.remove(key);
                    map.remove(target-key);
                }
            }
        }
        return res;
    }
}
