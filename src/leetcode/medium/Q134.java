package leetcode.medium;

/**
 * Created by user on 2018/8/13.
 */
public class Q134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] res = new int[n];
        for(int i = 0;i < n;i++){
            res[i] = gas[i] - cost[i];
        }
        int total = 0;
        for(int i : res)
            total += i;
        if(total < 0)
            return -1;
        boolean flag;
        for(int i = 0;i < n;i++){
            total = 0;
            flag = true;
            for(int j = i;j < i + n;j++){
                total += res[j % n];
                if(total < 0){
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }
}
