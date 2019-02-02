package leetcode.medium;

/**
 * Created by user on 2018/8/14.
 */
public class Q423 {
    public String originalDigits(String s) {
        char[] cs = s.toCharArray();
        int[] count = new int[26];
        for(char c : cs){
            count[c - 'a'] ++;
        }
        int[] res = new int[10];
        //0
        res[0] = count['z' - 'a'];
        count['r' - 'a'] -= res[0];
        count['o' - 'a'] -= res[0];
        //8
        res[8] = count['g' - 'a'];
        count['h' - 'a'] -= res[8];
        //3
        res[3] = count['h' - 'a'];
        count['r' - 'a'] -= res[3];
        //4
        res[4] = count['r' - 'a'];
        count['f' - 'a'] -= res[4];
        count['o' - 'a'] -= res[4];
        //5
        res[5] = count['f' - 'a'];
        count['v' - 'a'] -= res[5];
        //6
        res[6] = count['x' - 'a'];
        //7
        res[7] = count['v' - 'a'];
        count['n' - 'a'] -= res[7];
        //2
        res[2] = count['w' - 'a'];
        count['o' - 'a'] -= res[2];
        //1
        res[1] = count['o' - 'a'];
        count['n' - 'a'] -= res[1];
        //9
        res[9] = count['n' - 'a'] / 2;
        String str = "";
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < res[i];j++)
                str += i;
        }
        return str;
    }
}
