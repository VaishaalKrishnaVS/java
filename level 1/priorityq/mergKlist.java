import java.io.*;
import java.util.*;

public class mergKlist {
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {
      ArrayList<Integer> rv = new ArrayList<>();
      PriorityQueue<pair> pq = new PriorityQueue<>((pair a, pair b) -> {
         return a.data - b.data;
      });
      for (int i = 0; i < lists.size(); i++) {
         pair p = new pair(i, 0, lists.get(i).get(0));
         pq.add(p);
      }
      while (pq.size() > 0) {
         pair p = pq.remove();
         rv.add(p.data);
         p.di++;

         if (p.di < lists.get(p.li).size()) {
            p.data = lists.get(p.li).get(p.di);
            pq.add(p);
         }
      }

      return rv;
   }

   public static class pair {
      int li;
      int di;
      int data;

      pair(int li, int di, int data) {
         this.li = li;
         this.di = di;
         this.data = data;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for (int i = 0; i < k; i++) {
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for (int j = 0; j < n; j++) {
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for (int val : mlist) {
         System.out.print(val + " ");
      }
      System.out.println();
   }

}