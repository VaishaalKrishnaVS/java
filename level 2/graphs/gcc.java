import java.util.ArrayList;
import java.util.Scanner;

public class gcc {
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
        scn.close();

        System.out.println(gcc(graph));

    }

    public static ArrayList<ArrayList<Integer>> gcc(ArrayList<Edge>[] graph) {
        boolean v[] = new boolean[graph.length];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < v.length; i++) {
            if (!v[i]) {
                ArrayList<Integer> t = new ArrayList<>();
                recall(graph, i, v, t);
                ans.add(t);
            }
        }
        return ans;
    }

    public static void recall(ArrayList<Edge>[] graph, int v, boolean arr[], ArrayList<Integer> ans) {
        arr[v] = true;
        ans.add(v);
        for (Edge e : graph[v]) {
            if (!arr[e.des])
                recall(graph, e.des, arr, ans);
        }
    }
}
