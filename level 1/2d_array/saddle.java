import java.util.Scanner;

public class saddle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        for (int r = 0; r < n; r++) {
            int min = minr(arr, r);
            int max = maxc(arr, min);
            if (max == r) {
                System.out.println(arr[max][min]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

    public static int minr(int arr[][], int r) {
        int min = arr[r][0];
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[r][i] < min) {
                min = arr[r][i];
                m = i;
            }
        }
        return m;
    }

    public static int maxc(int arr[][], int c) {
        int max = arr[0][c];
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][c] > max) {
                max = arr[i][c];
                m = i;
            }
        }
        return m;
    }
}
