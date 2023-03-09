

import java.util.Scanner;

public class fi_li {
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
        int fi = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == m) {
                fi = mid;
                high = mid - 1;
            } else if (arr[mid] > m)
                high = mid - 1;
            else
                low = mid + 1;
        }

        low = 0;
        high = n - 1;
        int li = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == m) {
                li = mid;
                low = mid + 1;
            } else if (arr[mid] > m)
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println(fi);
        System.out.println(li);

    }
}
