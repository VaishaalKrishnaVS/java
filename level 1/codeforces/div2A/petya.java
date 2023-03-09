import java.util.Scanner;

public class petya {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String b = scn.next();
        scn.close();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int n = a.length();
        boolean mn = false;
        for (int i = 0; i < n; i++) {
            char m = a.charAt(i);
            char o = b.charAt(i);
            int s = m - o;
            if (s == 0)
                mn = true;
            else if (s < 0) {
                System.out.println("-1");
                mn = false;
                break;
            } else if (s > 0) {
                System.out.println("1");
                mn = false;
                break;
            }

        }
        if (mn)
            System.out.println("0");
    }
}
