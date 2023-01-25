package t2;

import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        scn.close();
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println(arr[i]);
                System.out.println(i);
            }
        }
    }
}
