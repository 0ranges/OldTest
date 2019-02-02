package Algs4.Graphs.Chapter4_1;

import Algs4.Fundamentals.Chapter1_3.Queue;
import edu.princeton.cs.algs4.Stack;

import java.util.Iterator;

/**
 * Created by user on 2018/3/16.
 */
public class EulerianCycle {
    private Stack<Integer> cycle = new Stack<>();
    private static class Edge{
        private final int v;
        private final int w;
        private boolean isUsed;
        public Edge(int v,int w){
            this.v = v;
            this.w = w;
            isUsed = false;
        }
        public int other(int vertex){
            if(vertex == v)
                return w;
            else if(vertex == w)
                return v;
            else
                throw new IllegalArgumentException("Illegal endpoint");
        }
    }
    public EulerianCycle(Graph G){
        if(G.E() == 0)
            return;
        for(int v = 0;v<G.V();v++)
            if(G.degree(v) % 2 != 0)
                return;
        Queue<Edge>[] adj = (Queue<Edge>[])new Queue[G.V()];
        for(int v = 0;v<G.V();v++)
            adj[v] = new Queue<>();
        for(int v = 0;v<G.V();v++){
            int selfLoops = 0;
            for(int w:G.adj(v)){
                if(v == w){
                    if(selfLoops % 2 == 0){
                        Edge e = new Edge(v,w);
                        adj[v].enqueue(e);
                        adj[w].enqueue(e);
                    }
                    selfLoops++;
                }else if(v<w){
                    Edge e = new Edge(v,w);
                    adj[v].enqueue(e);
                    adj[w].enqueue(e);
                }
            }
        }
        int s = nonIsolatedVertex(G);
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        cycle = new Stack<>();
        while(!stack.isEmpty()){
            int v = stack.pop();
            while(!adj[v].isEmpty()){
                Edge edge = adj[v].dequeue();
                if(edge.isUsed)
                    continue;
                edge.isUsed = true;
                stack.push(v);
                v = edge.other(v);
            }
            cycle.push(v);
        }
        if(cycle.size() != G.E()+1)
            cycle = null;
        assert certifySolution(G);
    }
    public Iterable<Integer> cycle(){
        return cycle;
    }
    public boolean hasEulerianCycle(){
        return cycle != null;
    }
    private static int nonIsolatedVertex(Graph G){
        for(int v = 0;v<G.V();v++)
            if(G.degree(v)>0)
                return v;
        return -1;
    }
    private static boolean satisfiesNecessaryAndSufficientConditions(Graph G){
        if(G.E() == 0)
            return false;
        for (int v = 0; v < G.V(); v++)
            if (G.degree(v) % 2 != 0)
                return false;
        int s = nonIsolatedVertex(G);
        BreadthFirstPaths bfs = new BreadthFirstPaths(G,s);
        for (int v = 0; v < G.V(); v++)
            if (G.degree(v) > 0 && !bfs.hasPathTo(v))
                return false;
        return true;
    }
    private boolean certifySolution(Graph G){
        if(hasEulerianCycle() == (cycle == null))
            return false;
        if(hasEulerianCycle() != satisfiesNecessaryAndSufficientConditions(G))
            return false;
        if(cycle == null)
            return true;
        if (cycle.size() != G.E() + 1)
            return false;
        int first = -1, last = -1;
        for (int v : cycle()) {
            if (first == -1) first = v;
            last = v;
        }
        if (first != last)
            return false;
        return true;

    }
}
