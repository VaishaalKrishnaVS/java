import java.util.ArrayList;
import java.util.PriorityQueue;
// import java.util.Scanner;

public class mst_gfg{

    public static class Edge{
        int vtx,nbr,wt;
        Edge(int vtx, int nbr, int wt){
            this.vtx=vtx;
            this.nbr=nbr;
            this.wt=wt;
        }

        public String toString() {
            return vtx + "->" + nbr + " "+wt;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int vtx,par,wt;
        Pair(int vtx, int par, int wt){
            this.par=par;
            this.vtx=vtx;
            this.wt=wt;
        }

        public int compareTo(Pair o){
            return this.wt-o.wt;
        }
    }

    public static int mst(ArrayList<Edge>[]g){
        int ans=0;
        PriorityQueue<Pair>q = new PriorityQueue<>();
        boolean []vis = new boolean[g.length];
        q.add(new Pair(0, -1, 0));
        while(q.size()>0){
            Pair rm = q.remove();
            if(!vis[rm.vtx]){
                vis[rm.vtx] = true;
                ans+=rm.wt;
                ArrayList<Edge>ed = g[rm.vtx];
                for(Edge e:ed){
                    if(!vis[e.nbr])q.add(new Pair(e.nbr, rm.vtx, e.wt));
                }

            }
        }


        return ans;
    }

    public static void main(String[] args) {

        int n =5;
        int [][]arr = { { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
        ArrayList<Edge>[]g = new ArrayList[n];
        for(int i=0;i<g.length;i++) g[i] = new ArrayList<>();
        for(int r = 0;r<n;r++){
            for(int c=0;c<n;c++){
                int w = arr[r][c];
                if(w==0) continue;
                if(r>c){
                    g[r].add(new Edge(r, c, w));
                    g[c].add(new Edge(c, r, w));
                }
            }
        }
        for(ArrayList<Edge>e:g) System.out.println(e);
        System.out.println(mst(g));

    }
}