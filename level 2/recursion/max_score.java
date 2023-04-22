import java.util.HashMap;

public class max_score {
    public static void main(String[] args) {
        int n = 4;
        String arr[] = { "dog", "cat", "dad", "good" };
        int k = 9;
        char all[] = { 'a', 'b', 'c', 'd', 'd', 'd', 'g', 'o', 'o' };
        int sc[] = { 1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        HashMap<Character, Integer> avail = new HashMap<>();
        for (char ch : all)
            avail.put(ch, avail.getOrDefault(ch, 0) + 1);
        HashMap<Character, Integer> score = new HashMap<>();
        char i = 'a';
        for (int s : sc)
            score.put(i++, s);

        System.out.println(recall(0, arr, avail, score));

    }

    public static int recall(int i, String arr[], HashMap<Character, Integer> avail,
            HashMap<Character, Integer> score) {
        if (i == arr.length)
            return 0;
        int max1 = recall(i + 1, arr, avail, score);
        int max2 = 0;
        String str = arr[i];
        
        for (char ch : str.toCharArray()) {
            if (!avail.containsKey(ch))
                return max1;
        }
        
        for (char ch : str.toCharArray()) {
            max2 += score.get(ch);
            if (avail.get(ch) == 1)
                avail.remove(ch);
            else
                avail.put(ch, avail.get(ch) - 1);

        }
        max2 += recall(i + 1, arr, avail, score);
        for (char ch : str.toCharArray())
            avail.put(ch, avail.getOrDefault(ch, 0) + 1);

        return Math.max(max1, max2);
    }
}
