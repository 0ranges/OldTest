package leetcode.eazy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/4/3.
 */
public class Q412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1;i<=n;i++) {
            if (i % 5 == 0 && i % 3 == 0)
                list.add("FizzBuzz");
            else if (i % 5 != 0 && i % 3 == 0)
                list.add("Fizz");
            else if (i % 5 == 0 && i % 3 != 0)
                list.add("Buzz");
            else
                list.add("" + i);
        }
        return list;
    }
}
