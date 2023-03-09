 

import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        int max = max(n, m);

        int[] arr3 = new int[max];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = arr3.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += arr1[i];
            if (j >= 0)
                sum += arr2[j];
            int rem = sum % 10;
            arr3[k] = rem;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        if (carry > 0)
            System.out.println(carry);  
        for (int val : arr3) {
            System.out.println(val);
        }
        scn.close();

    }

    public static int max(int n, int m) {
        if (n > m)
            return n;
        else
            return m;
    }
}
