package leetcode.medium;

/**
 * @author : oranges
 * @date : 2018/9/13 11:20
 */
public class Q785 {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        boolean[] set1 = new boolean[n];
        boolean[] set2 = new boolean[n];
        boolean flag = true;
        int i = 0;
        for(;i<n;i++){
            if(graph[i].length > 0){
                break;
            }
        }
        if(n == i){
            return true;
        }
        set1[i] = true;
        i = 0;
        while(i < n){
            if(flag) {
                for(int j = 0;j < n;j++){
                    if(set1[j] && graph[j].length > 0){
                        for(int a : graph[j]){
                            if(set1[a]){
                                return false;
                            }
                            set2[a] = true;
                        }
                    }
                }
            }if(!flag){
                for(int j = 0;j < n;j++){
                    if(set2[j] && graph[j].length > 0){
                        for(int a : graph[j]){
                            if(set2[a]){
                                return false;
                            }
                            set1[a] = true;
                        }
                    }
                }
            }
            flag = !flag;
            i++;
        }
        return true;
    }
}
