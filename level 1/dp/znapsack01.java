import java.util.Scanner;

public class znapsack01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int v[] = new int[n];
        int w[] = new int[n];
        for (int i = 0; i < n; i++)
            v[i] = scn.nextInt();
        for (int i = 0; i < n; i++)
            w[i] = scn.nextInt();
        int t = scn.nextInt();
        scn.close();
        int dp[][] = new int[n + 1][t + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int val = v[i - 1];
                int wt = w[i - 1];
                if (j >= wt)
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt] + val);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(dp[dp.length][dp[0].length]);
    }
}
