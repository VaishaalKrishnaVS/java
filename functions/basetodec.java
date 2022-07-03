package functions;

import java.util.Scanner;

public class basetodec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        int sum = 0;
        int mul = 1;

        while (n > 0) {
            int rem = n % 10;
            sum += rem * mul;
            mul *= b;
            n /= 10;
        }
        return sum;
    }
}
