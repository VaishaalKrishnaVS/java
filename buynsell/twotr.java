import java.util.Scanner;

public class twotr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        scn.close();
        int min = arr[0];
        int s[] = new int[n];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            int cp = arr[i] - min;
            if (cp > s[i - 1])
                s[i] = cp;
            else
                s[i] = s[i - 1];
        }
        int max = arr[arr.length - 1];
        int b[] = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max)
                max = arr[i];
            int cp = max - arr[i];
            if (cp > b[i + 1])
                b[i] = cp;
            else
                b[i] = b[i + 1];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] + b[i] > ans)
                ans = s[i] + b[i];
        }
        System.out.println(ans);

    }
}
