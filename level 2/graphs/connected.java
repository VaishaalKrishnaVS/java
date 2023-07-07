import java.util.ArrayList;
import java.util.Scanner;

public class connected {
    public static class Edge{
        int src;
        int des;
        Edge(int src, int des){
            this.src=src;
            this.des=des;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v = scn.nextInt();
        int e = scn.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<e;i++ ){
            int v1= scn.nextInt();
            int v2=scn.nextInt();

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
            
        }

        System.out.println(con(graph));
    }
    public static boolean con(ArrayList<Edge>[] graph){
        return (gcc(graph).size()==1);
    }
    public static ArrayList<ArrayList<Integer>> gcc(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                ArrayList<Integer> temp = new ArrayList<>();
                recall(graph,i,vis,temp);
                ans.add(temp);
            }
        }

        return ans;
    }
    public static void recall(ArrayList<Edge>[] graph, int v, boolean vis[], ArrayList<Integer> ans){
        vis[v] = true;
        ans.add(v);
        for(Edge e:graph[v]){
            if(!vis[e.des]) recall(graph,e.des,vis,ans);
        }
    }
}
