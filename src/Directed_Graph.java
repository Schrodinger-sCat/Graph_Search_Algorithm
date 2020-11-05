import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Directed_Graph {
    public int[][]graph;

    public Directed_Graph(String input){
        try{
            File f=new File(input);
            Scanner sc=new Scanner(f);
            //int n=Integer.parseInt(sc.nextLine());
            int n=sc.nextInt();
            graph=new int[n][n];
            for(int[] ar: graph){
                Arrays.fill(ar, 0);
            }
            //for(int[] g: graph) System.out.println(Arrays.toString(g));
            n=sc.nextInt();
            for(int i=0; i<n; i++){
                graph[sc.nextInt()][sc.nextInt()]=1;
            }
            //for(int[] g: graph) System.out.println(Arrays.toString(g));
        }catch (Exception e){
            System.out.println("Input file not found!");
        }
    }
    public int[][] getGraph(){
        return graph;
    }
}
