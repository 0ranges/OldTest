package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/**
 * @author : oranges
 * @title : leetcode.medium
 * @date : 2019/2/13 9:45
 * @description :
 */
public class Q890 {
    public static void main(String[] args) {
        List<String> list = findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"},"abb");
        for(String str : list){
            System.out.println(str);
        }
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        int n = pattern.length();
        for(String word : words){
            if(word.length() == n) {
                boolean judge = true;
                int[] letters1 = new int[26];
                int[] letters2 = new int[26];
                Arrays.fill(letters1,-1);
                Arrays.fill(letters2,-1);
                for(int i = 0;i < n;i++){
                    int index1 = word.charAt(i) - 'a';
                    int index2 = pattern.charAt(i) - 'a';
                    if(letters1[index1] == -1){
                        if(letters2[index2] == -1) {
                            letters1[index1] = index2;
                            letters2[index2] = index1;
                        }else{
                            judge = false;
                            break;
                        }
                    }else if(letters1[index1] != index2){
                        judge = false;
                        break;
                    }else if(letters2[index2] != index1){
                        judge = false;
                        break;
                    }
                }
                if(judge){
                    res.add(word);
                }
            }
        }
        return res;
    }
}
