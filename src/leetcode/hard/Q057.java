package leetcode.hard;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2018/7/24.
 * fail
 */
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class Q057 {
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,2));
        intervals.add(new Interval(3,5));
        intervals.add(new Interval(6,7));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(12,16));

        System.out.println(insert(intervals,new Interval(4,8)));
    }
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals == null || intervals.size() == 0){
            List<Interval> list = new ArrayList<>();
            list.add(newInterval);
            return list;
        }
        int i = 0;
        return intervals;
    }
}
