package Arithmetic.JichuTimu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/20.
 */
/*
字母重排
输入一个字典（用******结尾），然后再输入若干单词。
每输入一个单词w，你都需要在字典中找出所有可以用w的字母重排后得到的单词，
并按照字典序从小到大的顺序在一行中输出（如果不存在，则输出:(）
输入单词之间用空格或空行隔开，且所有单词都有不超过6个大小字母组成。
注意，字典中的单词不一定按字典序排列。
例子：
输入：
tarp given score refund only trap work earn course pepper part
******
resco nfudre aptr sett oresuc
输出：
score
refund
part tarp trap
:(
course
 */
public class Example08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<String> vector01 = new Vector<>();
        String need = null;
        while (input.hasNext()){
            String str = input.next();
            if(!"******".equals(str.trim())){
                vector01.add(str);
            }else{
                input.nextLine();
                need = input.nextLine();
                break;
            }
        }

        Vector<String> vector02 = new Vector<>();
        for(int i = 0;i<vector01.size();i++){
            vector02.add(sort(vector01.get(i)));
        }
        need = need.trim();
        need += " ";
        while(need.indexOf(' ') != -1){
            String str = need.substring(0,need.indexOf(' '));
            need = need.substring(need.indexOf(' ')+1);
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0;i<vector01.size();i++) {
                if (sort(str).equals(vector02.get(i))){
                    list.add(vector01.get(i));
                }
            }
            if(list.size() == 0){
                System.out.println(":(");
            } else {
                String result[] = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    result[i] = list.get(i);
                }
                Arrays.sort(result);
                for (int i = 0; i < result.length; i++) {
                    System.out.printf("%s ", result[i]);
                }
                System.out.println();
            }
        }
    }
    private static String sort(String str){
        char c[] = str.toCharArray();
        for(int i = 0;i<c.length;i++){
            for(int j =i;j<c.length;j++){
                if(c[j]>c[i]){
                    char t = c[j];
                    c[j] = c[i];
                    c[i] = t;
                }
            }
        }
        return new String(c);
    }
}
