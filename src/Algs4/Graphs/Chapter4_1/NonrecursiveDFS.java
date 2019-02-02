package Algs4.Graphs.Chapter4_1;

import edu.princeton.cs.algs4.Stack;

import java.util.Iterator;

/**
 * Created by user on 2018/3/1.
 */
public class NonrecursiveDFS {
    private boolean[] marked;
    public NonrecursiveDFS(Graph G,int s){
        marked = new boolean[G.V()];
        validateVertex(s);

        Iterator<Integer>[] adj = (Iterator<Integer>[])new Iterator[G.V()];
        for(int v = 0;v<G.V();v++)
            adj[v] = G.adj(v).iterator();
        Stack<Integer> stack = new Stack<>();
        marked[s] = true;
        stack.push(s);
        while (!stack.isEmpty()){
            int v = stack.peek();
            if(adj[v].hasNext()){
                int w = adj[v].next();
                if(!marked[w]){
                    marked[w] = true;
                    stack.push(w);
                }
            }else {
                stack.pop();
            }
        }
    }
    private void validateVertex(int v) {
        int V = marked.length;
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }
}
