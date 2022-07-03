package functions;

import java.util.Scanner;

public class anybaseadd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        n1 = getValueIndecimal(n1, b);
        n2 = getValueIndecimal(n2, b);

        int d = getSum(n1, n2);
        d = getValueInBase(d, b);
        System.out.println(d);
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

    public static int getSum(int n1, int n2) {
        return n1 + n2;
    }

    // for difference
    public static int getD(int n1, int n2) {
        return n2 - n1;
    }

    // for mutiplication
    public static int getM(int n1, int n2) {
        return n1 * n2;
    }

}
