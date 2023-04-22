import java.util.HashMap;
import java.util.Scanner;

public class typo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char a = scn.next().charAt(0);
            char b = scn.next().charAt(0);
            char c1 = a;
            char c2 = b;
            if (map.containsKey(a))
                c1 = map.get(a);
            if (map.containsKey(b))
                c2 = map.get(b);

            map.put(a, c2);
            map.put(b, c1);
        }

        scn.close();

        HashMap<Character, Character> hm = new HashMap<>();
        for (char ch : map.keySet()) {
            char val = map.get(ch);
            hm.put(val, ch);
        }

        String s = scn.next();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            boolean lc = false;
            if (Character.isLowerCase(ch))
                lc = true;
            ch = Character.toUpperCase(ch);

            if (hm.containsKey(ch)) {
                if (lc)
                    sb.append(Character.toLowerCase(hm.get(ch)));
                else
                    sb.append(hm.get(ch));
            } else {
                if (lc)
                    sb.append(Character.toLowerCase(ch));
                else
                    sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
