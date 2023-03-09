package t2;

import java.util.Scanner;

public class strdig {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print("-1");
                return;
            }
        }
        int n = str.length();
        if (n <= 9)
            System.out.print(n);
        else {
            int r = n % 10;
            n /= 10;
            str += n;
            System.out.print(str + " " + r);
        }
    }
}
