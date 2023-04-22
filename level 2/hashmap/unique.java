import java.util.*;

public class unique {

    public static int solution(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray())
            set.add(ch);
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        while (true) {
            boolean f1 = true;
            boolean f2 = true;
            while (i < str.length() && map.size() < set.size()) {
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                f1 = false;
                i++;
            }
            while (j < i && map.size() == set.size()) {
                if (i - j  < ans)
                    ans = i - j ;
                char ch = str.charAt(j);
                int v = map.get(ch);
                if (v == 1)
                    map.remove(ch);
                else
                    map.put(ch, v - 1);
                j++;
                f2 = false;
            }
            if (f1 && f2)
                break;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
        scn.close();
    }

}
