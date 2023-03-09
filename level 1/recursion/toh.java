import java.util.Scanner;

public class toh {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        scn.close();
        tow(n, A, B, C);
    }

    public static void tow(int n, int A, int B, int C) {
        if (n == 0)
            return;
        tow(n - 1, A, C, B);
        System.out.println(n + "[" + A + " -> " + B + "]");
        tow(n-1, C, B, A);
    }
}
