import java.util.Arrays;
import java.util.Scanner;

public class climbstr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.print(recall(n, arr, 0,dp));
        for(int s:dp){
            System.out.print(s+" ");
        }
        scn.close();
    }

    public static int recall(int tar, int arr[], int s, int dp[]) {
        if (s == tar)
            return dp[0]=1;
        if(dp[s]!=-1) return dp[s];
        int j = arr[s];
        int ans = 0;
        for (int i = 1; i <= j && i + s <= tar; i++) {
            ans += recall(tar, arr, s + i,dp);
        }
        return dp[s]=ans;
    }

    public static int rec(int tar, int s, int arr[],int dp[]){
        if(tar==s) return dp[0]=1;
        int ans=0;
        int jump = arr[s];
        for(int i=1;i<=jump&&i+s<=tar;i++){
            ans+=rec(tar,s+i,arr,dp);
        }
        return dp[s]=ans;
        

    }
}
