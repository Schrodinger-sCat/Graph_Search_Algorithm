import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Search {
    int[] level;
    boolean[] visited;
    public BFS(int[][] graph, int source, int[] level){
        this.graph=graph;
        this.source=source;
        this.level=level;
        visited=new boolean[graph.length];
        Arrays.fill(visited, false);
    }
    public void search(){
        Queue<Integer> q= new LinkedList<>();
        q.add(source);
        visited[source]=true;
        level[source]=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            for(int i= 0; i<graph[0].length; i++){
                if(graph[node][i]==1&&!visited[i]){
                    q.add(i);
                    visited[i]=true;
                    level[i]=level[node]+1;
                }
            }
        }
    }
}
