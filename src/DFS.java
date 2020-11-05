import java.util.Arrays;
import java.util.Stack;

public class DFS extends Search {
    public DFS(int[][] graph){
        this.graph=graph;
    }
    public String search(int source){
        int[] visited=new int[graph[0].length];
        Arrays.fill(visited, -1);
        return dfs(source, visited, graph);
    }
    public static String dfs(int source, int[] visited, int[][] graph){
        String traversed_nodes="";
        visited[source]=0;
        for(int i=0; i<graph[0].length; i++){
            if(graph[source][i]==1&&!(visited[i]==1)){
                traversed_nodes=traversed_nodes+dfs(i, visited, graph);
            }
        }
        visited[source]=1;
        return traversed_nodes+source;
    }
}
