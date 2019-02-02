package leetcode.medium;

/**
 * Created by user on 2018/3/20.
 */
public class Q777 {
    public static void main(String[] args) {
        System.out.print(canTransform("XXXLXXXXXX","XXXLXXXXXX"));
    }
    public static boolean canTransform(String start, String end) {
        String a = "",b = "";
        int count_a = 0,count_b = 0;
        if(start.length()!=end.length())
            return false;
        for(int i = 0;i<start.length();i++){
            if(start.charAt(i) == 'X')
                count_a++;
            else
                a += start.charAt(i);
            if(end.charAt(i) == 'X')
                count_b++;
            else
                b += end.charAt(i);
        }
        return count_a>0&&a.equals(b)&&count_a==count_b;
    }
}
