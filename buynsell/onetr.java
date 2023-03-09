import java.util.Scanner;

public class onetr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int ans = 0;
        int cp = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < cp)
                cp = arr[i];
            int p = arr[i] - cp;
            if (p > ans)
                ans = p;
        }
        System.out.println(ans);
        scn.close();
    }
}
