package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/3/19.
 */
public class Q022 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        method(list,"",n,0);
        return list;
    }
    public void method(List<String> list,String str,int left,int right){
        if(left == 0&&right == 0)
            list.add(str);
        else{
            if(left > 0)
                method(list,str + "(",left-1,right+1);
            if(right > 0)
                method(list,str + ")",left,right-1);
        }
    }
}
