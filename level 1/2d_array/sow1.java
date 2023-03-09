import java.util.Scanner;

public class sow1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        scn.close();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.println(mat[j][i] + "\t");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.println(mat[j][i] + "\t");
                }
            }
        }
    }
}
