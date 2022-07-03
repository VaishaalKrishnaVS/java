package functions;

import java.util.Scanner;

public class basetobase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        scn.close();
        n = getValueIndecimal(n, sourceBase);
        System.out.println(getValueInBase(n, destBase));
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

    public static int getValueInBase(int n, int b) {
        int sum = 0;
        int mul = 1;

        while (n > 0) {
            int rem = n % b;
            sum += rem * mul;
            mul *= 10;
            n = n / b;
        }
        return sum;
    }
}
