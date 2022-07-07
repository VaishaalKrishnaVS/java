package array;

import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();

        for (int i = 0; i < n; i++) {
            if (d == arr[i])
                System.out.println(i);
        }
        scn.close();
    }
}
