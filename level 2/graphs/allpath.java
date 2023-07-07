import java.util.ArrayList;
import java.util.Scanner;

public class allpath {
    public static class Edge {
        int src, des;

        Edge(int src, int des) {
            this.src = src;
            this.des = des;
        }

        public String toString() {
            return src + "->" + des;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v = scn.nextInt();
        int e = scn.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i < v; i++)
            graph[i] = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            int v1 = scn.nextInt();
            int v2 = scn.nextInt();

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }
        
        int sr = scn.nextInt();
        int ds = scn.nextInt();
        scn.close();
        recall(graph,sr,ds,new boolean[v],"0");
    }
    public static void recall(ArrayList<Edge>[] g, int sr, int ds, boolean b[], String ans){
        if(sr==ds){
            System.out.println(ans);
            return;
        }
        b[sr]=true;
        for(Edge e :g[sr]){
            if(!b[e.des]){
                recall(g,e.des,ds,b,ans+e.des);
            }
        }
        b[sr]=false;
    }
}
