import java.util.Scanner;

public class disarr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        dis(arr, 0);
    }

    public static void dis(int arr[], int n) {
        if (n == arr.length)
            return;
        System.out.println(arr[n]);
        dis(arr, n + 1);
    }
}
