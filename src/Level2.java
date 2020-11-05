import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Level2{
    public static void main(String[]args){
        int[][] graph=new Graph("Input\\level2.txt").getGraph();
        int[] level=new int[graph.length];
        int lina=0, nora=0, lara=0;
        try {
            int n= Integer.parseInt(Files.lines(Paths.get("Input\\level2.txt")).skip(1).findFirst().get());
            lina= Integer.parseInt(Files.lines(Paths.get("Input\\level2.txt")).skip(n+2).findFirst().get());
            nora= Integer.parseInt(Files.lines(Paths.get("Input\\level2.txt")).skip(n+3).findFirst().get());
            lara= Integer.parseInt(Files.lines(Paths.get("Input\\level2.txt")).skip(n+4).findFirst().get());
        } catch (IOException e) {
            System.out.println("File not found!");
        }
        //for(int[] g: graph) System.out.println(Arrays.toString(g));
        new BFS(graph, nora, level).search();
        System.out.println("Minimum number of moves needed for Nora: "+level[lina]);
        int n=level[lina];
        new BFS(graph, lara, level).search();
        System.out.println("Minimum number of moves needed for Lara: "+level[lina]);
        int l=level[lina];
        if(n<l) System.out.println("The Winner is Nora");
        else System.out.println("The winner is Lara");
        //System.out.println(Arrays.toString(level));
    }
}
