import java.util.ArrayList;
import java.util.Scanner;

public class hasPath {
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
        int de = scn.nextInt();
        System.out.println(recall(graph,sr,de,new boolean[v]));
    }
    public static boolean recall(ArrayList<Edge>[] g, int s, int d, boolean[] arr){
        if(s==d) return true;
        arr[s] = true;
        for(Edge e:g[s]){
            if(!arr[e.des]){
                boolean ans = recall(g, e.des, d, arr);
                if(ans) return ans;
            }
        }
        return false;
    }
}
