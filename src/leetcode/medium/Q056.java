package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017/8/20.
 *
 *

 56. Merge Intervals

 Given a collection of intervals, merge all overlapping intervals.

 For example,
 Given [1,3],[2,6],[8,10],[15,18],
 return [1,6],[8,10],[15,18].

 */
public class Q056 {
    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.isEmpty())
            return intervals;
        quick(intervals,0,intervals.size()-1);
        List<Interval> need = new ArrayList<>();
        need.add(intervals.get(0));
        Interval a = need.get(0);
        for(int i = 1;i<intervals.size();i++){
            Interval b = intervals.get(i);
            if(b.start<=a.end)
                a.end = Math.max(a.end,b.end);
            else{
                need.add(b);
                a = b;
            }
        }
        return need;
    }
    public static int quicksort(List<Interval> intervals,int l,int r) {
        int i = l;
        int j = r;
        Interval x = intervals.get(l);
        while (i<j){
            while(i<j&&intervals.get(j).start>=x.start){
                j--;
            }
            if(i<j){
                intervals.set(i,intervals.get(j));
                i++;
            }
            while(i<j&&intervals.get(i).start<x.start)
                i++;
            if(i<j){
                intervals.set(j,intervals.get(i));
                j--;
            }
        }
        intervals.set(i,x);
        return i;
    }
    public static void quick(List<Interval> list,int l,int r){
        if(l<r){
            int i = quicksort(list,l,r);
            quick(list,l,i-1);
            quick(list,i+1,r);
        }
    }

    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(2,2));
        list.add(new Interval(1,43));
        list.add(new Interval(4,5));
        list.add(new Interval(7,21));
        list.add(new Interval(5,22));
        list.add(new Interval(6,1));
        quick(list,0,5);
        for(int i = 0;i<6;i++)
            System.out.println(list.get(i).start+" "+list.get(i).end);
    }
}
