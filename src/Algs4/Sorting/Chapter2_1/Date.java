package Algs4.Sorting.Chapter2_1;

/**
 * Created by user on 2017/11/29.
 */
public class Date implements Comparable<Date> {
    private final int day;
    private final int month;
    private final int year;
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int day(){
        return day;
    }
    public int month(){
        return month;
    }
    public int year(){
        return year;
    }
    public int compareTo(Date date){
        if(this.year > date.year)
            return 1;
        if(this.year < date.year)
            return -1;
        if(this.month > date.month)
            return 1;
        if(this.month < date.month)
            return -1;
        if(this.day > date.day)
            return 1;
        if(this.day < date.day)
            return -1;
        return 0;
    }
    public String toString(){
        return month+"/"+day+"/"+year;
    }
}
