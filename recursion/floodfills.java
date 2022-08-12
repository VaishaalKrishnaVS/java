import java.util.Scanner;

public class floodfills {
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

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, int dr, int dc, String asf) {
        if (sr == dr && sc == dc) {
            System.out.println(asf);
            return;
        }
        if (sc < 0 || sr < 0 || sc == maze[0].length || sr == maze.length || maze[sr][sc] == 1) {
            return;
        }
        maze[sr][sc] = 1;
        floodfill(maze, sr - 1, sc, dr, dc, asf + 't');
        floodfill(maze, sr, sc - 1, dr, dc, asf + 'l');
        floodfill(maze, sr + 1, sc, dr, dc, asf + 'd');
        floodfill(maze, sr, sc + 1, dr, dc, asf + 'r');
        maze[sr][sc] = 0;
    }
}