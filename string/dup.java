import java.util.HashMap;
import java.util.Map;

public class dup {
    public static void main(String[] args) {
        String str = "vaishaalkrishna";
        String stri = "subhashini";
        printDup(str);
        printDup(stri);
    }

    public static void printDup(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!mp.containsKey(str.charAt(i)))
                mp.put(str.charAt(i), 1);
            else
                mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);

        }
        for (Map.Entry m : mp.entrySet()) {
            char ch = (char) m.getKey();
            int n = (int) m.getValue();
            if (n > 1)
                System.out.println(ch + " " + n);
        }
    }
}
