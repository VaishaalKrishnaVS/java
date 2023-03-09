import java.util.Scanner;

public class painthouse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[3][n];
        for (int c = 0; c < n; c++) {
            for (int r = 0; r < 3; r++) {
                arr[r][c] = scn.nextInt();
            }
        }
        int r = arr[0][0];
        int g = arr[1][0];
        int b = arr[2][0];

        for (int i = 1; i < n; i++) {
            int nr = arr[0][i] + Math.min(g, b);
            int ng = arr[1][i] + Math.min(r, b);
            int nb = arr[2][i] + Math.min(r, g);
            r = nr;
            g = ng;
            b = nb;
        }
        System.out.println(Math.min(g, Math.min(r, b)));
        scn.close();

    }
}
