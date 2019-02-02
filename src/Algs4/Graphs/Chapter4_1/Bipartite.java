package Algs4.Graphs.Chapter4_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stack;

/**
 * Created by user on 2018/3/14.
 */
//二分图 使用DFS
public class Bipartite {
    private boolean isBipartite;
    private boolean[] color;
    private boolean[] marked;
    private int[] edgeTo;
    private Stack<Integer> cycle;

    public Bipartite(Graph G){
        isBipartite = true;
        color = new boolean[G.V()];
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        for(int v = 0;v<G.V();v++){
            if(!marked[v])
                dfs(G,v);
        }
        assert check(G);
    }
    private void dfs(Graph G,int v){
        marked[v] = true;
        for(int w:G.adj(v)){
            if(cycle != null)
                return;
            if(!marked[w]){
                edgeTo[w] = v;
                color[w] = !color[v];
                dfs(G,w);
            }else if(color[w] == color[v]){
                isBipartite = false;
                cycle = new Stack<>();
                cycle.push(w);
                for(int x = v;x!=w;x = edgeTo[x])
                    cycle.push(x);
                cycle.push(w);
            }
        }
    }
    public boolean isBipartite(){
        return isBipartite;
    }
    public boolean color(int v){
        validateVertex(v);
        if(!isBipartite)
            throw new UnsupportedOperationException("graph is not bipartite");
        return color[v];
    }
    public Iterable<Integer> oddCycle(){
        return cycle;
    }
    private boolean check(Graph G){
        if(isBipartite){
            for(int v = 0;v<G.V();v++){
                for(int w:G.adj(v)){
                    if(color[v] == color[w]){
                        System.out.printf("edge %d-%d with %d and %d in same side of bipartition\n",v,w,v,w);
                        return false;
                    }
                }
            }
        }else{
            int first = -1,last = -1;
            for(int v:oddCycle()){
                if(first == -1)
                    first = v;
                last = v;
            }
            if(last != first){
                System.out.printf("cycle begins with %d and ends with %d\\n\", first, last");
                return false;
            }
        }
        return true;
    }
    private void validateVertex(int v){
        int V = marked.length;
        if(v<0||v>=V)
            throw new IllegalArgumentException("vertex "+v+" is not between 0 and "+(V-1));
    }
}
