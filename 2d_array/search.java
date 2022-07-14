import java.util.Scanner;

public class search {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();

        int[][] mat = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int x = scn.nextInt();
        scn.close();
        boolean b = false;
        int r = 0;
        int c = m - 1;
        while (r < m && c >= 0) {

            if (mat[r][c] < x) {
                r++;
            } else if (mat[r][c] > x) {
                c--;
            } else {
                System.out.println(r);
                System.out.println(c);
                b = true;
                break;
            }
        }
        if (!b)
            System.out.println("Not Found");
    }
}
