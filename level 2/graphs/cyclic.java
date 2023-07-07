import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class cyclic {
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
        System.out.println(isCy(graph, 0));
    }

    public static boolean isCy(ArrayList<Edge>[] g, int v) {
        boolean vis[] = new boolean[g.length];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(v);
        while (q.size() > 0) {
            int rm = q.remove();

            if(!vis[rm]){
                vis[rm] = true;

                for(Edge e:g[rm]){
                    if(!vis[e.des]) q.add(e.des);
                }
            }
            else return true;
        }
        return false;
    }
}
