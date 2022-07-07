package array;

import java.util.Scanner;

public class barchart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int max = arr[0];
        for (int val : arr) {
            if (val > max)
                max = val;
        }
        for (int row = max; row >= 1; row--) {
            for (int col = 1; col <= n; col++) {
                if (arr[col] >= row) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
