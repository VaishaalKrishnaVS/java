import java.io.*;
import java.util.*;

public class pqusingheap {

    public static class PriorityQueue {
        ArrayList<Integer> data;

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        public void upheapify(int ci) {
            if (ci == 0)
                return;

            int pi = (ci - 1) / 2;
            if (data.get(ci) < data.get(pi)) {
                swap(data, pi, ci);
                upheapify(pi);
            }
        }

        public void swap(ArrayList<Integer> data, int pi, int ci) {
            int par = data.get(pi);
            int chi = data.get(ci);

            data.set(pi, chi);
            data.set(ci, par);
        }

        public int remove() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            swap(data, 0, data.size() - 1);
            int val = data.remove(data.size() - 1);
            downheapify(0);
            return val;
        }

        public void downheapify(int pi) {
            int m = pi;
            int li = 2 * pi + 1;
            int ri = 2 * pi + 2;
            if (li < data.size() && data.get(li) < data.get(pi))
                m = li;
            if (ri < data.size() && data.get(ri) < data.get(pi))
                m = ri;
            if (pi != m) {
                swap(data, pi, m);
                downheapify(m);
            }
        }

        public int peek() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            return data.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}