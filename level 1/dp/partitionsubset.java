import java.util.Scanner;

public class partitionsubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int dp[][] = new int[k + 1][n + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 || j == 0 || i > j)
                    dp[i][j] = 0;
                else if (i == j || i==1)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i - 1][j - 1] + (i * dp[i][j - 1]);
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);
        pr(dp);
        scn.close();
    }

    public static void pr(int[][] arr) {
        for (int r[] : arr) {
            for (int e : r)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}
