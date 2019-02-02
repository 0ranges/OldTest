package leetcode.medium;

/**
 * Created by user on 2018/8/2.
 */
public class Q402 {
    public static void main(String[] args) {
        System.out.println(removeKdigits("9",1));
    }
    public String removeKdigits01(String num,int k){
        int n;
        while(true){
            n = num.length();
            if(n <= k || n == 0) return "0";
            if(k-- == 0) return num;
            if(num.charAt(1) == '0'){
                int firstNotZero = 1;
                while(firstNotZero < num.length()  && num.charAt(firstNotZero) == '0') firstNotZero ++;
                num=num.substring(firstNotZero);
            } else{
                int startIndex = 0;
                while(startIndex < num.length() - 1  && num.charAt(startIndex) <= num.charAt(startIndex + 1)) startIndex ++;
                num=num.substring(0,startIndex)+num.substring(startIndex+1);
            }
        }
    }
    public static String removeKdigits(String num, int k) {
        int i = 0;
        int j = 0;
        while(k>=0&&j<num.length()){
            if(num.charAt(j) == '0'&&j-i<=k){
                k -= (j - i);
                i = j + 1;
            }
            j++;
        }
        num = num.substring(i);
        int a = k;
        while(a>0){
            char max = '0';
            for(i = 0;i<k+a&&i<num.length();i++){
                if(num.charAt(i) > max){
                    max = num.charAt(i);
                }
            }
            num = num.replaceFirst(""+max,"");
            a--;
        }
        if(num.equals(""))
            return "0";
        return num;
    }
}
