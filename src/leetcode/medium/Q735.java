package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : oranges
 * @date : 2018/8/23 15:11
 */
public class Q735 {
    public int[] asteroidCollision(int[] asteroids) {
            int n = asteroids.length;
            if(n <= 1) {
                return asteroids;
            }
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i < n;i++){
                int len = list.size();
                if(len == 0){
                    list.add(asteroids[i]);
                    continue;
                }
                if(list.get(len - 1) > 0 && asteroids[i] < 0){
                    while(len > 0 && list.get(len - 1) < Math.abs(asteroids[i]) && list.get(len - 1) > 0 && asteroids[i] < 0){
                        list.remove(len - 1);
                        len --;
                    }
                    if(len == 0 || list.get(len - 1) < 0){
                        list.add(asteroids[i]);
                    }else if(list.get(len - 1) == Math.abs(asteroids[i])){
                        list.remove(len - 1);
                    }
                }else{
                    list.add(asteroids[i]);
                }
            }
            int[] res = new int[list.size()];
            for(int i = 0;i<res.length;i++){
                res[i] = list.get(i);
            }
            return res;
    }
}
