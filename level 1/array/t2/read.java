package t2;

import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int arr[] = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = scn.nextInt();
        // }

        // int k = scn.nextInt();
        // scn.close();
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == k) {
        // System.out.println(arr[i]);
        // System.out.println(i);
        // }
        // }
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        while (tc-- > 0) {
            int n = scn.nextInt();
            int l = scn.nextInt();
            int s = scn.nextInt();
            boolean flag = true;

            for (int i = 1; i <= n - l; i++) {
                int sum = 0;
                for (int j = i; j <= i + l; j++) {
                    sum += j;
                }
                int val = sum - s;
                for (int j = i; j <= i + l; j++) {
                    if (j == val) {
                        System.out.println("YES");
                        flag = false;   
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("NO");
        }
    }
}
