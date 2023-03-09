import java.util.Scanner;

public class vir_streak {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int n = scn.nextInt();
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            if (stk(i) == s)
                ans++;
        }
        System.out.println(ans);

    }

    public static int stk(int i) {

        int k = 0;
        while ((i + k) % (k + 1) == 0)
            k++;

        return k;
    }
}
