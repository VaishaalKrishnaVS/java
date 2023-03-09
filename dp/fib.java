import java.util.*;

public class fib {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = recall(n, dp);
        System.out.println(ans);
        scn.close();

    }

    public static int recall(int n, int dp[]) {
        if (n <= 1)
            return dp[n] = n;
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = recall(n - 1, dp) + recall(n - 2, dp);
    }

    public static int rec(int n){
        if(n<=1){
            
            return n;
        }
        return rec(n-1)+rec(n-2);
    }

}