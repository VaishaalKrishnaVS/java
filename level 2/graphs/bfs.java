import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
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
        bfs(graph, 0);
    }

    public static class Pair {
        int src;
        String path;

        Pair(int src, String path) {
            this.src = src;
            this.path = path;
        }
    }

    public static void bfs(ArrayList<Edge>[] g, int src) {
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, "" + src));
        boolean vis[] = new boolean[g.length];
        while(q.size()>0){
            Pair r = q.remove();

            if(vis[r.src]==false){
                vis[r.src]=true;
                System.out.println(r.src+"@"+r.path);

                for(Edge e:g[r.src]){
                    if(!vis[e.des]) q.add(new Pair(e.des, r.path+e.des));
                }
            }
        }

    }
}
