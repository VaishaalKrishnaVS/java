import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        scn.close();
    }

    public static int fact(int n) {
        if(n==0)
        return 1;
        int anss = n * fact(n - 1);
        return anss;
    }
}
