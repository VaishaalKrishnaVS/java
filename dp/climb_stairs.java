import java.util.Arrays;
import java.util.Scanner;


public class climb_stairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        scn.close();
        ;

        System.out.println(rec(n));
    }

    public static int recall(int n, int dp[]) {
        if (n == 0)
            return dp[n] = 1;
        if (n < 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];
        int ans = 0;
        ans += recall(n - 1, dp);
        ans += recall(n - 2, dp);
        ans += recall(n - 3, dp);
        return dp[n] = ans;

    }

    public static int tab(int n, int arr[]) {
        for (int i = 0; i <= n; i++) {
            if (n == 0) {
                arr[0] = 1;
                continue;
            }

            arr[i] = arr[i - 1] + (i - 2 >= 0 ? arr[i - 2] : 0) + (i - 3 >= 0 ? arr[i - 3] : 0);

        }
        return arr[n];
    }

    public static int rec(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        int ans =0;
        ans+=rec(n-1);
        ans+=rec(n-2);
        ans+=rec(n-3);

        return ans;
    }
}
