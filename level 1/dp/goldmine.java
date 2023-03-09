import java.util.Scanner;

public class goldmine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        //get input ass
        int dp[][] = new int[n][m];
        for (int j = m - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {

                if (j == m - 1)
                    dp[i][j] = arr[i][j];
                else {
                    int u = i - 1 >= 0 ? dp[i - 1][j + 1] : -1;
                    int mid = dp[i][j + 1];
                    int l = i + 1 < n ? dp[i + 1][j + 1] : -1;

                    dp[i][j] = Math.max(u, Math.max(mid, l));
                }

            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i][0]);
        }
        System.out.println(ans);
        scn.close();;
    }
}
