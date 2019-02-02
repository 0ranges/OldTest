package Algs4.Graphs.Chapter4_1;

import Algs4.Fundamentals.Chapter1_3.Queue;
import Algs4.Fundamentals.Chapter1_3.Stack;

/**
 * Created by user on 2018/3/15.
 */
public class BipartiteX {
    private static final boolean WHITE = false;
    private static final boolean BLACK = true;
    private boolean isBipartite;
    private boolean[] color;
    private boolean[] marked;
    private int[] edgeTo;
    private Queue<Integer> cycle;

    public BipartiteX(Graph G){
        isBipartite = true;
        color = new boolean[G.V()];
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        for(int v = 0;v<G.V();v++){
            if(!marked[v])
                bfs(G,v);
        }
        check(G);
    }
    private void bfs(Graph G,int s){
        Queue<Integer> q = new Queue<>();
        color[s] = WHITE;
        marked[s] = true;
        q.enqueue(s);
        while(!q.isEmpty()){
            int v = q.dequeue();
            for(int w:G.adj(v)){
                if(!marked[w]){
                    marked[w] = true;
                    color[w] = !color[v];
                    edgeTo[w] = v;
                    q.enqueue(w);
                }else if(color[w] == color[v]){
                    isBipartite = false;
                    cycle = new Queue<>();
                    Stack<Integer> stack = new Stack<>();
                    int x = v;
                    int y = w;
                    while(x!=y){
                        stack.push(x);
                        cycle.enqueue(y);
                        x = edgeTo[x];
                        y = edgeTo[y];
                    }
                    stack.push(x);
                    while(!stack.isEmpty()){
                        cycle.enqueue(stack.pop());
                    }
                    cycle.enqueue(w);
                    return;
                }
            }
        }
    }
    public boolean isBipartite(){
        return isBipartite;
    }
    public boolean color(int v) {
        validateVertex(v);
        if (!isBipartite)
            throw new UnsupportedOperationException("Graph is not bipartite");
        return color[v];
    }
    public Iterable<Integer> oddCycle() {
        return cycle;
    }
    private boolean check(Graph G){
        if(isBipartite){
            for(int v = 0;v<G.V();v++){
                for(int w:G.adj(v)){
                    if(color[w] == color[v])
                        System.err.printf("edge %d-%d with %d and %d in same side of bipartition\n", v, w, v, w);
                    return false;
                }
            }
        }else{
            int first = -1, last = -1;
            for (int v : oddCycle()) {
                if (first == -1) first = v;
                last = v;
            }
            if (first != last) {
                System.err.printf("cycle begins with %d and ends with %d\n", first, last);
                return false;
            }
        }
        return true;
    }
    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }
}
