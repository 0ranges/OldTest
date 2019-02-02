package Arithmetic.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/4/26.
 */
/*
描述
BG在双扣中被赌神虐得意识模糊，发誓苦练出牌技能。

现在BG手中有非常多的牌，但它只会出顺子，且一副顺子里每种牌的张数只能有一张，否则会数不清牌。
即使是在如此的劣势下BG依然在追求完美，它希望每一次打出的顺子长度都属于给定的一个集合。
根据给定的要求，BG思考着最优的出牌方法。现在它想知道，最少几手能够出完所有的牌。

输入
多组数据，到EOF结束。
每组数据第一行一个正整数n，表示牌的种数。
第二行n个自然数，分别表示编号为1~n的牌的张数。
第三行一个正整数m。
第四行m个自然数，表示被强迫症所困扰的BG允许打出的顺子长度集合。

1<=m<=n<=13,每种牌张数<=8，数据组数<=20
输出
每组数据输出一行。
若BG不能出完所有的牌，则输出“WTD is really a Gambling God!”。
若BG能够出完所有的牌，则输出“BG will finish the cards by ans steps.”，其中ans为最少的出牌次数。
样例输入
5
1 4 4 1 0
3
5 1 4
样例输出
BG will finish the cards by 7 steps.
 */
public class Exercise02 {
    public static void main(String[] args) throws Exception{
        Vector<Vector<Integer>> all = new Vector<>();
        Vector<Integer> add = new Vector<>();
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(input.hasNextLine()){
            count++;
            count %= 4;
            String str = input.nextLine().trim();
            if("".equals(str)&&count == 1){
                break;
            }else{
                int n = 0;
                switch (count){
                    case 1:
                        add.add(Integer.parseInt(str));
                        break;
                    case 2:
                        for(int i = 0;i<add.get(0)-1;i++){
                            add.add(Integer.parseInt(str.substring(0,str.indexOf(' '))));
                            str = str.substring(str.indexOf(' ')+1).trim();
                        }
                        add.add(Integer.parseInt(str));
                        break;
                    case 3:
                        add.add(Integer.parseInt(str));
                        break;
                    case 0:
                        int x = add.get(add.size()-1)-1;
                        for(int i = 0;i<x;i++){
                            add.add(Integer.parseInt(str.substring(0,str.indexOf(' '))));
                            str = str.substring(str.indexOf(' ')+1).trim();
                        }
                        add.add(Integer.parseInt(str));
                        all.add(add);
                        add = new Vector<>();
                        break;
                }
            }
        }
        for(int i = 0;i<all.size();i++){
            Vector<Integer> get = all.get(i);
            int n =get.get(0);
            int num[] = new int[n];
            for(int j = 0 ;j<n;j++){
                num[j] = get.get(1+j);
            }
            int index = get.get(n+1);
            int m[] = new int[index];
            for(int j = 0;j<index;j++){
                m[j] = get.get(n+2+j);
            }
            int ans = 0;
            Arrays.sort(m);
            for(int j = index-1;j>=0;j--){
                for (int k = 0; k < n; k++)
                    if (k + m[j] <= n) {
                        boolean flag = true;
                        while(flag) {
                            for (int a = k; a < k + m[j]; a++) {
                                if (num[a] == 0) {
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                for (int a = k; a < k+m[j]; a++) {
                                    num[a]--;
                                }
                                ans++;
                            }
                        }
                }
            }
            boolean flag = true;
            for(int x:num){
                if(x!=0){
                    flag = false;
                    break;
                }
            }
            System.out.printf("%s\n",flag?"BG will finish the cards by "+ans+" steps.":"WTD is really a Gambling God!");
        }
    }
}
