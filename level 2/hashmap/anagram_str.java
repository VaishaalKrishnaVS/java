import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class anagram_str {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }
        scn.close();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for (String str : arr) {
            String m = create(str);
            if (map.containsKey(m)) {
                ArrayList<String> ls = map.get(m);
                ls.add(str);
                map.put(m, ls);
            } else {
                ArrayList<String> nl = new ArrayList<>();
                nl.add(str);
                map.put(m, nl);
            }
        }
        for (String s : map.keySet()) {
            ArrayList<String> temp = map.get(s);
            ans.add(temp);
        }
        System.out.println(ans);
    }

    public static String create(String s) {
        HashMap<Character, Integer> f = new HashMap<>();
        for (char ch : s.toCharArray())
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        StringBuilder ans = new StringBuilder();
        for (Character ch : f.keySet()) {
            int v = f.get(ch);
            ans.append(ch);
            ans.append(v);
        }
        return ans.toString();
    }
}