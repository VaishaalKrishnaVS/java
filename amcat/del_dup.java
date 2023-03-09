import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class del_dup {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        scn.close();
        String arr[] = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);
        List<String> ans = new ArrayList<>();
        for (String str : map.keySet()) {
            int n = map.get(str);
            if (n > 1)
                ans.add(str);
        }
        if (ans.size() == 0)
            return;
        String d[] = new String[ans.size()];
        for (int i = 0; i < d.length; i++)
            d[i] = ans.get(i);
        Arrays.sort(d);

        print1(d);
    }

    public static void print1(String arr[]) {
        for (String x : arr)
            System.out.print(x + " ");
    }
}
