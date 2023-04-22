
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cc1 {
    public static void coinChange(int[] coins, int amtsf, int tamt, String asf, boolean[] used) {
        if (amtsf == tamt) {
            System.out.println(asf + ".");
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            if (used[i] == false && amtsf + coins[i] <= tamt) {
                used[i] = true;
                coinChange(coins, amtsf + coins[i], tamt, asf + coins[i] + "-", used);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int amt = Integer.parseInt(br.readLine());
        boolean[] used = new boolean[coins.length];
        coinChange(coins, 0, amt, "", used);
    }
}