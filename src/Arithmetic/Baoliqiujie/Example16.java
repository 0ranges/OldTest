package Arithmetic.Baoliqiujie;

/**
 * Created by user on 2017/5/21.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * 八数码问题
 *
 * 2 6 4 1 3 7 0 5 8
 8 1 5 7 3 6 4 0 2
 */
public class Example16 {

    static class State{
        public int state[] = new int[9];
    }
    public static int vis[] = new int[362880];
    public static int fact[] = new int[9];
    public static State st[] = new State[1000000];
    public static int dist[] = new int[1000000];
    public static final int dx[] = {-1,1,0,0};
    public static final int dy[] = {0,0,-1,1};

    public static void main(String[] args) {
        for(int i = 0;i<vis.length;i++){
            vis[i] = i+1;
        }
        Scanner input = new Scanner(System.in);
        State state = new State();
        State goal = new State();
        for(int i = 0;i<9;i++){
            state.state[i] = input.nextInt();
        }
        for(int i = 0;i<9;i++){
            goal.state[i] = input.nextInt();
        }
        st[0] = state;
        dist[0] = 0;
        int ans = bfs(goal);
        System.out.println(dist[ans]);
    }
    public static int bfs(State goal){
        init_table();
        int front = 0;
        int rear = 1;
        while (front<rear){
            int s[] = st[front].state;
            int z;
            if(Arrays.equals(s,goal.state))
                    return front;
            for(z=0;z<9;z++){
                if(s[z] == 0)
                    break;
            }
            int x = z/3;
            int y = z%3;
            for(int d = 0 ;d<4;d++){
                int newx = x + dx[d];
                int newy = y + dy[d];
                int newz = newx*3+newy;
                if(newx>=0&&newx<3&&newy>=0&&newy<3){
                    int t[] = Arrays.copyOf(s,s.length);
                    t[newz] = s[z];
                    t[z] = s[newz];
                    State state = new State();
                    state.state = t;
                    st[rear] = state;
                    dist[rear] = dist[front]+1;
                    if(insert(rear)>0)
                        rear++;
                }
            }
            front++;
        }
        return 0;
    }
    public static void init_table(){
        fact[0] = 1;
        for(int i = 1;i<9;i++){
            fact[i] = fact[i-1]*i;
        }
    }
    public static int insert(int s){
        int code = 0;
        for(int i = 0;i<9;i++){
            int cnt = 0;
            for(int j = i+1;j<9;j++) {
                if (st[s].state[j] < st[s].state[i]) {
                    cnt++;
                }
            }
            code += fact[8-i]*cnt;
        }
        if(vis[code]>0) {
            vis[code] = 0;
            return 1;
        }
        else return 0;
    }
}

