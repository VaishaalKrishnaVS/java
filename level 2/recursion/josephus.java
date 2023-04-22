import java.util.Scanner;

public class josephus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int ans = recall(n, k);
        System.out.println(ans);
        scn.close();

    }

    public static int recall(int n, int k) {
        if (n == 1)
            return 0;
        int ans = recall(n - 1, k);
        return (ans + k) % n;

    }
}
