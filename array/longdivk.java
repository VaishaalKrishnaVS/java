import java.util.HashMap;

public class longdivk {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 6, 1, 4, 5 };

        int k = 3;
        System.out.println(sol(arr, k));
    }

    public static int sol(int arr[], int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int rem = 0;
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            rem = sum % k;
            if (rem < 0)
                rem += k;

            if (map.containsKey(rem)) {
                int idx = map.get(rem);
                int len = i - idx;
                if (len > ans)
                    ans = len;
            } else
                map.put(rem, i);
        }
        return ans;
    }
}
