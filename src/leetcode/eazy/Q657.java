package leetcode.eazy;

import java.util.Scanner;

/**
 * Created by user on 2017/8/15.
 *
 *
 *
 Judge Route Circle

 Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

 The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

 Example 1:
 Input: "UD"
 Output: true
 Example 2:
 Input: "LL"
 Output: false
 */
public class Q657 {
    public static boolean judgeCircle(String moves) {
        moves = moves.toLowerCase();
        int n = moves.length();
        int x = 0;
        int y = 0;
        for(int i = 0;i<n;i++){
            switch (moves.charAt(i)){
                case 'r':x++;break;
                case 'l':x--;break;
                case 'u':y++;break;
                case 'd':y--;break;
            }
        }
        return x==0&&y==0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String moves = input.next();
        System.out.println(judgeCircle(moves));
    }
}
