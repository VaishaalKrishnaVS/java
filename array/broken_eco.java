package array;

import java.util.Scanner;

public class broken_eco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        sc.close();
        int low = 0;
        int high = n - 1;
        int fl = 0;
        int cl = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == m) {
                fl = arr[mid];
                cl = arr[mid];
                break;
            } else if (arr[mid] > m) {
                high = mid - 1;
                cl = arr[mid];
            } else {
                low = mid + 1;
                fl = arr[mid];
            }
        }
        System.out.println(fl);
        System.out.println(cl);
    }
}
