import java.util.Arrays;

public class Level4 {
    public static void main(String[] args) {
        int[][] graph = new Directed_Graph("Input\\level4.txt").getGraph();
        String[] traversed_nodes=new String[graph.length];
        //for(int[] g: graph) System.out.println(Arrays.toString(g));
        DFS dfs=new DFS(graph);
        int max=-12, max_index=0;
        for(int i=0; i<traversed_nodes.length; i++){
            traversed_nodes[i]=dfs.search(i);
            if(traversed_nodes[i].length()>max)
            {
                max=traversed_nodes[i].length();
                max_index=i;
            }
            //System.out.println(traversed_nodes[i]);
        }
        System.out.println("Nora should start from: "+max_index+"\nShe can visit all the nodes if she start from this node.");
    }
}