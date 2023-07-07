import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class mst_pep {

    public static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }

    }

    public static class Pair implements Comparable<Pair>{
        int vtx,par,wt;
        Pair(int vtx, int par, int wt){
            this.vtx=vtx;
            this.par=par;
            this.wt=wt;
        }
        public int compareTo(Pair o){
            return this.wt-o.wt;
        }

        public String toString(){
            return par+"-"+vtx+"-"+wt;
        }
    }

    public static int min(ArrayList<Edge>[]g){
        int ans=0;
        boolean vis[] = new boolean[g.length];
        PriorityQueue<Pair>q= new PriorityQueue<>();
        q.add(new Pair(0,-1,0));
        while(q.size()>0){
            Pair rm = q.poll();
            if(!vis[rm.vtx]){
                vis[rm.vtx]=true;
                System.out.println(rm);
                ans+=rm.wt;
                ArrayList<Edge>ed = g[rm.vtx];
                for(Edge e:ed){
                    if(!vis[e.nbr]) q.add(new Pair(e.nbr, rm.vtx, e.wt));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        System.out.println(min(graph));
    }
}
