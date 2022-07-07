package array;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        scn.close();
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == m) {
                System.out.println(mid);
                break;
            } else if (arr[mid] > m)
                high = mid - 1;
            else
                low = mid + 1;
        }
    }
}
