import java.util.Scanner;

public class cc3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int tar = scn.nextInt();
        scn.close();
        recall(0, arr, 0, tar, "");
    }

    public static void recall(int i, int arr[], int s, int t, String str) {
        if (i == arr.length) {
            if (s == t)
                System.out.println(str + ".");
            return;
        }
        if (s == t) {
            System.out.println(str + ".");
            return;
        }

        if (s > t)
            return;
        recall(i + 1, arr, s + arr[i], t, str + arr[i] + "-");
        recall(i + 1, arr, s, t, str);
    }
}
