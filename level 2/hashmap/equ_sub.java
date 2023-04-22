import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class equ_sub {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        HashSet<Integer> set = new HashSet<>();
        for (int el : arr)
            set.add(el);
        int t = set.size();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while (true) {
            boolean f1 = true;
            boolean f2 = true;
            while (i < arr.length && map.size() < t) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                i++;
                f1 = false;
            }
            while (j < i && map.size() == t) {
                ans += n - i+1;
                System.out.println(ans);
                if (map.get(arr[j]) == 1)
                    map.remove(arr[j]);
                else
                    map.put(arr[j], map.get(arr[j]) - 1);
                j++;
                f2 = false;
            }
            if (f1 && f2)
                break;
        }
        System.out.println(ans);

    }
}
