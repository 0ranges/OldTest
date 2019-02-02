package leetcode.hard;

/**
 * @author : oranges
 * @date : 2018/8/23 16:35
 */
public class Q273 {
    public String numberToWords(int num) {
        if(num == 0) {
            return "Zero";
        }
        int index = 0;
        String res = "";
        while(num > 0){
            String str = inThunsand(num % 1000);
            switch (index){
                case 0:res += str;break;
                case 1:res = str + ("".equals(res) ? " Thousand" : " Thousand " + res);break;
                case 2:res = str + ("".equals(res) ? " Million" : " Million " + res);break;
                case 3:res = str + ("".equals(res) ? " Billion" : " Billion " + res);break;
                default:break;
            }
            index ++;
            num /= 1000;
        }
        return res;
    }
    public String inThunsand(int a){
        if(a >= 100){
            int i = a / 100;
            String res;
            switch (i){
                case 1: res = "One Hundred";break;
                case 2: res = "Two Hundred";break;
                case 3: res = "Three Hundred";break;
                case 4: res = "Four Hundred";break;
                case 5: res = "Five Hundred";break;
                case 6: res = "Six Hundred";break;
                case 7: res = "Seven Hundred";break;
                case 8: res = "Eight Hundred";break;
                case 9: res = "Nine Hundred";break;
                default:res = "";
            }
            return a % 100 == 0 ? res : res + " " + inThunsand(a % 100);
        }
        if(a >= 20){
            int i = a / 10;
            String res;
            switch (i){
                case 2: res = "Twenty";break;
                case 3: res = "Thirty";break;
                case 4: res = "Forty";break;
                case 5: res = "Fifty";break;
                case 6: res = "Sixty";break;
                case 7: res = "Seventy";break;
                case 8: res = "Eighty";break;
                case 9: res = "Ninety";break;
                default:res = "";
            }
            return a % 10 == 0 ? res : res + " " + inThunsand(a % 10);
        }
        if(a >= 10){
            String res;
            switch (a){
                case 10: res = "Ten";break;
                case 11: res = "Eleven";break;
                case 12: res = "Twelve";break;
                case 13: res = "Thirteen";break;
                case 14: res = "Fourteen";break;
                case 15: res = "Fifteen";break;
                case 16: res = "Sixteen";break;
                case 17: res = "Seventeen";break;
                case 18: res = "Eighteen";break;
                case 19: res = "Nineteen";break;
                default:res = "";
            }
            return res;
        }
        String res;
        switch (a){
            case 0: res = "";break;
            case 1: res = "One";break;
            case 2: res = "Two";break;
            case 3: res = "Three";break;
            case 4: res = "Four";break;
            case 5: res = "Five";break;
            case 6: res = "Six";break;
            case 7: res = "Seven";break;
            case 8: res = "Eight";break;
            case 9: res = "Nine";break;
            default:res = "";
        }
        return res;
    }
}
