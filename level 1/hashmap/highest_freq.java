import java.util.HashMap;
import java.util.Scanner;

public class highest_freq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char ans = str.charAt(0);
        int fr = map.get(ans);
        for (char ch : map.keySet()) {
            int val = map.get(ch);
            if (val > fr) {
                fr = val;
                ans = ch;
            }
        }
        System.out.println(ans);
    }
}
