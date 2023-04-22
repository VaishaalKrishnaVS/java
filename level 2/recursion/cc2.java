import java.util.Scanner;

public class cc2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int tot = scn.nextInt();
        recall(arr, 0, tot, "");
        scn.close();
    }

    public static void recall(int arr[], int amtsf, int tot, String s) {
        if (amtsf == tot) {
            System.out.println(s + ".");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (amtsf + arr[i] <= tot) {
                recall(arr, amtsf + arr[i], tot, s + arr[i] + "-");
            }
        }
    }
}
