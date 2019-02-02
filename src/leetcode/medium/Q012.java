package leetcode.medium;

/**
 * Created by user on 2018/3/17.
 */
public class Q012 {
    public String intToRoman(int num) {
        String[][] roman = {{"","I","II","III","IV","V","VI","VII","VIII","IX"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","M","MM","MMM"}};
        String result = "";
        for(int i = 0;i<=3;i++){
            result = roman[i][num%10]+result;
            num /= 10;
        }
        return result;
    }
}
