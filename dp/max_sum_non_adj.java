import java.util.Scanner;

public class max_sum_non_adj {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int in = arr[0];
        int ex = 0;

        for (int i = 1; i < n; i++) {
            int nin = ex + arr[i];
            int nex = Math.max(in, ex);

            in = nin;
            ex = nex;
        }
        System.out.println(Math.max(in,ex));
        scn.close();
    }
}
