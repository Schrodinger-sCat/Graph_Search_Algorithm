import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Level1{
    public static void main(String[]args){
        int[][] graph=new Graph("Input\\level1.txt").getGraph();
        int[] level=new int[graph.length];
        int lina=0;
        try {
            int n= Integer.parseInt(Files.lines(Paths.get("Input\\level1.txt")).skip(1).findFirst().get());
            lina= Integer.parseInt(Files.lines(Paths.get("Input\\level1.txt")).skip(n+2).findFirst().get());
        } catch (IOException e) {
            System.out.println("File not found!");
        }
        //for(int[] g: graph) System.out.println(Arrays.toString(g));
        new BFS(graph, 0, level).search();
        System.out.println("Minimum number of moves needed: "+level[lina]);
        //System.out.println(Arrays.toString(level));
    }
}
