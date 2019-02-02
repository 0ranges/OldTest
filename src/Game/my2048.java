package Game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by user on 2017/11/20.
 */
public class my2048 {
    private static int[][] play;
    private static void rand(){
        Vector<Integer> zeros = new Vector<>();
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++)
                if(play[i][j] == 0)
                    zeros.add(i*4+j);
        }
        int n = zeros.size();
        int a = (int)(Math.random()*n);
        int index = zeros.get(a);
        double suiji = Math.random();
        if(suiji<0.75)
            play[index/4][index%4] = 2;
        else
            play[index/4][index%4] = 4;
    }
    private static void move(char in){
        switch (in){
            case 'a':
                for(int i = 0;i<4;i++){
                    Vector<Integer> a = new Vector<>();
                    for(int j = 0;j<4;j++){
                        if(play[i][j] != 0)
                            a.add(play[i][j]);
                    }
                    a = add(a);
                    for(int j = 0;j<4;j++){
                        if(j < a.size())
                            play[i][j] = a.get(j);
                        else
                            play[i][j] = 0;
                    }
                }
                break;
            case 'd':
                for(int i = 0;i<4;i++){
                    Vector<Integer> a = new Vector<>();
                    for(int j = 0;j<4;j++){
                        if(play[i][3-j] != 0)
                            a.add(play[i][3-j]);
                    }
                    a = add(a);
                    for(int j = 0;j<4;j++){
                        if(j < a.size())
                            play[i][3-j] = a.get(j);
                        else
                            play[i][3-j] = 0;
                    }
                }
                break;
            case 'w':
                for(int i = 0;i<4;i++){
                    Vector<Integer> a = new Vector<>();
                    for(int j = 0;j<4;j++){
                        if(play[j][i] != 0)
                            a.add(play[j][i] );
                    }
                    a = add(a);
                    for(int j = 0;j<4;j++){
                        if(j < a.size())
                            play[j][i] = a.get(j);
                        else
                            play[j][i] = 0;
                    }
                }
                break;
            case 's':
                for(int i = 0;i<4;i++){
                    Vector<Integer> a = new Vector<>();
                    for(int j = 0;j<4;j++){
                        if(play[3-j][i] != 0)
                            a.add(play[3-j][i]);
                    }
                    a = add(a);
                    for(int j = 0;j<4;j++){
                        if(j < a.size())
                            play[3-j][i] = a.get(j);
                        else
                            play[3-j][i] = 0;
                    }
                }
                break;
        }
    }
    private static Vector<Integer> add(Vector<Integer> a){
        for(int i = 0;i<a.size()-1;i++){
            if(a.get(i) == a.get(i+1)){
                a.remove(i+1);
                a.set(i,a.get(i)*2);
            }
        }
        return a;
    }
    public static void view(){
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++)
                System.out.print(play[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        play = new int[4][4];
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++)
                play[i][j] = 0;
        }
        rand();
        view();
        char ch;
        Scanner input = new Scanner(System.in);
        while (true){
            ch = input.next().charAt(0);
            move(ch);
            rand();
            view();
        }
    }
}
