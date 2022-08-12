import java.util.Scanner;

public class nqueens {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int chess[][] = new int[n][n];
        scn.close();
        printnQ(chess, "", 0);
    }

    private static void printnQ(int[][] chess, String str, int n) {
        if (chess.length == n) {
            System.out.println(str + ".");
            return;
        }
        for (int i = 0; i < chess.length; i++) {

            if (isQueenSafe(chess, n, i)) {
                chess[n][i] = 1;
                printnQ(chess, str + n + "-" + i + ", ", n + 1);
                chess[n][i] = 0;
            }

        }
    }

    private static boolean isQueenSafe(int[][] chess, int n, int i) {
        for (int r = n; r >= 0; r--) {
            if (chess[r][i] == 1)
                return false;
        }
        for (int r = n, c = i; r >= 0 && c >= 0; r--, c--) {
            if (chess[r][c] == 1)
                return false;
        }
        for (int r = n, c = i; r >= 0 && c < chess[0].length; r--, c++) {
            if (chess[r][c] == 1)
                return false;
        }

        return true;
    }
}
