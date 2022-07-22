import java.util.Scanner;

public class rot90 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int r = 0; r < arr.length; r++) {
            int i = 0;
            int j = arr[0].length - 1;
            while (i < j) {
                int temp = arr[r][i];
                arr[r][i] = arr[r][j];
                arr[r][j] = temp;
                i++;
                j--;
            }
        }
        display(arr);
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
