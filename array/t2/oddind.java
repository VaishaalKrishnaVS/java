package t2;

import java.util.Scanner;

public class oddind {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i < n; i += 2) {
            System.out.println(arr[i]);
        }
        scn.close();
    }

}
