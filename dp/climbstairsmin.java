import java.util.Scanner;

public class climbstairsmin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Integer dp[] = new Integer[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0)
                continue;
            int m = Integer.MAX_VALUE;
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                if (dp[i + j] != null)
                    m = Math.min(m, dp[i + j]);
            }
            if (m != Integer.MAX_VALUE)
                dp[i] = 1 + m;
        }
        scn.close();
        System.out.println(dp[0]);
    }
}
