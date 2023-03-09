import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        int tot = n * m;
        int mc = 0;
        int mr = 0;
        int mac = arr[0].length - 1;
        int mar = arr.length - 1;

        while (tot > 0) {

            for (int i = mr; i <= mar && tot > 0; i++) {
                System.out.println(arr[i][mc]);
                tot--;
            }
            mc++;
            for (int i = mc; i <= mac && tot > 0; i++) {
                System.out.println(arr[mar][i]);
                tot--;
            }
            mar--;
            for (int i = mar; i >= mr && tot > 0; i--) {
                System.out.println(arr[i][mac]);
                tot--;
            }
            mac--;
            for (int i = mac; i >= mc && tot > 0; i--) {
                System.out.println(arr[mr][i]);
                tot--;
            }
            mr++;
        }
    }
}