import java.util.HashMap;
import java.util.Scanner;

public class lon_con_seq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int e : arr) {
            map.put(e, true);

        }
        for (int e : arr) {
            if (map.containsKey(e - 1))
                map.put(e, false);
        }
        int ml = 0;
        int s = 0;

        for (int k : map.keySet()) {
            if (map.containsKey(k) == true) {
                int len = 1;
                int st = k;

                while (map.containsKey(st + len)) {
                    len++;
                }
                if (len > ml) {
                    ml = len;
                    s = st;
                }
            }
        }

        for (int i = 0; i < ml; i++) {
            System.out.println(s + i);
        }

    }
}
