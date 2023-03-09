import java.util.HashMap;
import java.util.Scanner;

public class gce1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();

        int arr2[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }
        scn.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            if (map.containsKey(arr2[i])) {
                System.out.println((arr2[i]));
                map.remove(arr2[i]);
            }
        }

    }
}
