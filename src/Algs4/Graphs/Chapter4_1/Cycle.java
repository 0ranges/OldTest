package Algs4.Graphs.Chapter4_1;

import Algs4.Fundamentals.Chapter1_3.Stack;

/**
 * Created by user on 2018/3/16.
 */
public class Cycle {
    private boolean[] marked;
    private int[] edgeTo;
    private Stack<Integer> cycle;
    public Cycle(Graph G){
        if(hasSelfLoop(G))
            return;
        if(hasParalleEdges(G))
            return;
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        for(int v = 0;v<G.V();v++){
            if(!marked[v])
                dfs(G,-1,v);
        }
    }
    private boolean hasSelfLoop(Graph G){
        for(int v = 0;v<G.V();v++){
            for(int w:G.adj(v)){
                if(v == w){
                    cycle = new Stack<>();
                    cycle.push(v);
                    cycle.push(v);
                    return true;
                }
            }
        }
        return false;
    }
    private boolean hasParalleEdges(Graph G){
        marked = new boolean[G.V()];
        for(int v = 0;v<G.V();v++){
            for(int w:G.adj(v)) {
                if (marked[w]) {
                    cycle = new Stack<>();
                    cycle.push(v);
                    cycle.push(w);
                    cycle.push(v);
                    return true;
                }
                marked[w] = true;
            }
        }
        return false;
    }
    public boolean hasCycle(){
        return cycle != null;
    }
    public Iterable<Integer> cycle(){
        return cycle;
    }
    private void dfs(Graph G,int u,int v){
        marked[v] = true;
        for(int w:G.adj(v)){
            if(cycle!=null)
                return;
            if(!marked[w]){
                edgeTo[w] = v;
                dfs(G,v,w);
            }
            else if(w != u){
                cycle = new Stack<>();
                for(int x = v;x != w;x = edgeTo[x]){
                    cycle.push(x);
                }
                cycle.push(w);
                cycle.push(v);
            }
        }
    }
}
