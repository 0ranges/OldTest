package Algs4.Graphs.Chapter4_1;

/**
 * Created by user on 2018/3/14.
 */

/*
没有添加加权图对应的构造方法
    public CC(EdgeWeightedGraph G) {
        marked = new boolean[G.V()];
        id = new int[G.V()];
        size = new int[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
                count++;
            }
        }
    }
    private void dfs(EdgeWeightedGraph G, int v) {
        marked[v] = true;
        id[v] = count;
        size[count]++;
        for (Edge e : G.adj(v)) {
            int w = e.other(v);
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }
 */
public class CC {
    private boolean marked[];
    private int[] id;
    private int[] size;
    private int count;

    public CC(Graph G){
        marked = new boolean[G.V()];
        id = new int[G.V()];
        size = new int[G.V()];
        for(int v = 0;v<G.V();v++){
            if(!marked[v]){
                dfs(G,v);
                count++;
            }
        }
    }
    private void dfs(Graph G,int v){
        marked[v] = true;
        id[v] = count;
        size[count]++;
        for(int w:G.adj(v)){
            if(!marked[w])
                dfs(G,w);
        }
    }
    public int id(int v){
        validateVertex(v);
        return id[v];
    }
    public int size(int v){
        validateVertex(v);
        return size[id[v]];
    }
    public int count(){
        return count;
    }
    public boolean connected(int v,int w){
        validateVertex(v);
        validateVertex(w);
        return id[v] == id[w];
    }
    private void validateVertex(int v){
        int V = marked.length;
        if(v<0||v>=V)
            throw new IllegalArgumentException("vertex "+v+" is not between 0 and "+(V-1));
    }
}
