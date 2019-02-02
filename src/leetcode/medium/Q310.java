package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 2018/2/26.
 */
/*
 *最小高度树的根一定在图的一条最长路径的中间，寻找这条最长路径的
 *方法是从任意一点出发，找到最远的点，然后再从这个最远的点出发，
 *找到离它最远的点。可以用广度优先或者深度优先搜索。
 */
public class Q310 {
    private int maxNode, maxDepth;
    private void dfs(int from, int depth, List<Integer>[] graph, boolean[] visited, int[] dist, int[] prev) {
        if (depth > maxDepth) {
            maxDepth = depth;
            maxNode = from;
        }
        for(int next: graph[from]) {
            if (visited[next]) continue;
            visited[next] = true;
            prev[next] = from;
            dist[next] = depth+1;
            dfs(next, depth+1, graph, visited, dist, prev);
        }
    }
    private List<Integer> roots = new ArrayList<>();
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++) graph[i] = new ArrayList<>();
        for(int i=0; i<edges.length; i++) {
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }

        boolean[] visited = new boolean[n];

        int[] dist1 = new int[n];
        int[] prev1 = new int[n];
        maxNode = 0;
        maxDepth = 0;
        visited[0] = true;
        dfs(0, 0, graph, visited, dist1, prev1);
        int node1 = maxNode;

        int[] dist2 = new int[n];
        int[] prev2 = new int[n];
        Arrays.fill(visited, false);
        maxNode = node1;
        maxDepth = 0;
        visited[node1] = true;
        dfs(node1, 0, graph, visited, dist2, prev2);
        int node2 = maxNode;

        int node = node2;
        for(int i=0; i<maxDepth/2; i++) node = prev2[node];
        if ((maxDepth & 1) == 0) {
            roots.add(node);
        } else {
            roots.add(node);
            roots.add(prev2[node]);
        }
        return roots;
    }
}
