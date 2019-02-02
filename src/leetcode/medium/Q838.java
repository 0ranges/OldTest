package leetcode.medium;

/**
 * Created by user on 2018/5/26.
 */
public class Q838 {
    public static void main(String[] args) {
        System.out.println(pushDominoes("R.R.L"));
    }
    public static String pushDominoes(String dominoes) {
        if(dominoes.length() < 2)
            return dominoes;
        while(!stop(dominoes)){
            char[] chars = dominoes.toCharArray();
            for(int i = 0;i<dominoes.length();i++){
                if(chars[i] == 'L'){
                    if(chars[i-1] == 'R'&&i-1>=0)
                        chars[i-1] = '.';
                    else if(i-1>=0)
                        chars[i-1] = 'L';
                }else if(chars[i] == 'R'){
                    if(chars[i+1] == '.'&&i+1<chars.length) {
                        chars[i + 1] = 'R';
                        i++;
                    }
                }
            }
            dominoes = new String(chars);
        }
        return dominoes;
    }
    private static boolean stop(String dominoes){
        if(dominoes.charAt(0) == '.'&&dominoes.charAt(1) == 'L')
            return false;
        for(int i = 0;i<dominoes.length();i++){
            if(dominoes.charAt(i) == '.'){
                if(dominoes.charAt(i-1) == 'R'&&dominoes.charAt(i+1) == '.'||dominoes.charAt(i-1) == '.'&&dominoes.charAt(i+1) == 'L')
                    return false;
            }
        }
        if(dominoes.charAt(dominoes.length()-1) == '.'&&dominoes.charAt(dominoes.length()-2) == 'R')
            return false;
        return true;
    }
}
