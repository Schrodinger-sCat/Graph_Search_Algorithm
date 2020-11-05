import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Graph {
    public int[][]graph;

    public Graph(String input){
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
                int p=sc.nextInt();
                int q=sc.nextInt();
                graph[p][q]=1;
                graph[q][p]=1;
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
