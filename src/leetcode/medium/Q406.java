package leetcode.medium;

import java.util.*;

/**
 * Created by user on 2018/3/20.
 */
public class Q406 {
    public int[][] reconstructQueue(int[][] people) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        List<Integer> key = new ArrayList<>();
        for(int i = 0;i<people.length;i++){
            if(!map.containsKey(people[i][0])) {
                key.add(people[i][0]);
                List<Integer> list = new ArrayList<>();
                list.add(people[i][1]);
                map.put(people[i][0], list);
            }
            else{
                List<Integer> list = map.get(people[i][0]);
                list.add(people[i][1]);
            }
        }
        int[] array = new int[key.size()];
        for(int i = 0;i<array.length;i++)
            array[i] = key.get(i);
        Arrays.sort(array);
        int[][] result = new int[people.length][2];
        List<Integer> keys = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        for(int i = array.length-1;i>=0;i--){
            List<Integer> list = map.get(array[i]);
            int[] a = new int[list.size()];
            for(int j = 0;j<a.length;j++)
                a[j] = list.get(j);
            Arrays.sort(a);
            for(int index:a){
                keys.add(index,array[i]);
                values.add(index,index);
            }
        }
        for(int i = 0;i<keys.size();i++){
            result[i][0] = keys.get(i);
            result[i][1] = values.get(i);
        }
        return result;
    }
    public int[][] reconstructQueue02(int[][] people) {
        //二维排序问题，一定要首先把一个变量排好序，然后深刻理解另一个维度的意义
        //典型的二维排序问题，先按身高从高到低排好序；
        //k的意思是：在这个人前面有多少个比他高的，因为身高已经倒序拍好，这个人前面所有的东西都比他高，所以这个k就是他的index
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            }
        });
        List<int[]> tmp = new LinkedList<>();
        for (int[] i : people) {//i[1]代表前面有多少个比他高的，但是现在i之前的所有都比他高，所以i[1]就是他的index
            tmp.add(i[1], i);
        }
        return tmp.toArray(new int[people.length][2]);
    }
}
