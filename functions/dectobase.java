

import java.util.Scanner;

public class dectobase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
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
