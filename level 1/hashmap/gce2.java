import java.util.HashMap;
import java.util.Scanner;

public class gce2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a1[] = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int a2[] = new int[m];
        for (int i = 0; i < m; i++) {
            a2[i] = scn.nextInt();
        }
        scn.close();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int e : a1) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        for (int e : a2) {
            if (map.containsKey(e)) {
                System.out.println(e);
                map.put(e, map.get(e) - 1);
                if (map.get(e) == 0) map.remove(e);
            }
        }
    }
}
