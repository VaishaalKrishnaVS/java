import java.util.Scanner;

public class floodfills_op {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        floodfill(arr, 0, 0, n - 1, m - 1, "");
    }

    static int[][] dir = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    static String[] val = { "t", "l", "d", "r" };

    public static void floodfill(int maze[][], int sr, int sc, int dr, int dc, String ans) {
        if (sc == dc && sr == dr) {
            System.out.println(ans);
            return;
        }
        for (int d = 0; d < 4; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < maze.length && c < maze[0].length && maze[r][c] == 0) {
                maze[r][c] = 1;
                floodfill(maze, r, c, dr, dc, ans + val[d]);
            }
        }
        maze[sr][sc] = 0;
    }
}
