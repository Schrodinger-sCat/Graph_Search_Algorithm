import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Level3 {
    public static void main(String[] args) {
        int[][] graph = new Reverse_Directed_Graph("Input\\level3.txt").getGraph();
        int[] level = new int[graph.length];
        int lina = 0, j= 0, n=0;
        try {
            n = Integer.parseInt(Files.lines(Paths.get("Input\\level3.txt")).skip(1).findFirst().get());
            lina = Integer.parseInt(Files.lines(Paths.get("Input\\level3.txt")).skip(n + 2).findFirst().get());
            j = Integer.parseInt(Files.lines(Paths.get("Input\\level3.txt")).skip(n + 3).findFirst().get());
        } catch (IOException e) {
            System.out.println("File not found!");
        }
        int[] k=new int[j];
        try{
            for(int i=0; i<k.length; i++){
                k[i]= Integer.parseInt(Files.lines(Paths.get("Input\\level3.txt")).skip(i+n+4).findFirst().get());
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }
        //System.out.println(Arrays.toString(k));
        new BFS(graph, lina, level).search();
        //System.out.println(Arrays.toString(level));
        int min=level[k[0]], min_index=k[0];
        for(int i=1; i<k.length; i++){
            if(level[k[i]]<min) {
                min = level[k[i]];
                min_index = k[i];
            }
        }
        System.out.println("Minimum number of steps needed to go: "+min+" and the winner is k"+(min_index));
    }
}