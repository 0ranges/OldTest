package leetcode.eazy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/8/13.
 */
public class Q728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left;i <= right;i++){
            int j = i;
            boolean flag = true;
            while (j > 0){
                int k = j % 10;
                if(k == 0 || i % k != 0) {
                    flag = false;
                    break;
                }
                j /= 10;
            }
            if(flag)
                res.add(i);
        }
        return res;
    }
}
