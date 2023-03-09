import java.util.Scanner;

public class allpalin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        scn.close();
        String s = "";
        int n = a.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                s = a.substring(i, j);
                if (isPalindrome(s))
                    System.out.println(s);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            char st = s.charAt(i);
            char en = s.charAt(j);
            if (st != en)
                return false;
            i++;
            j--;
        }
        return true;
    }
}
