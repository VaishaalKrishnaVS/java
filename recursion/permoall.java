import java.util.Scanner;

public class permoall {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        recall(str, "", str.length());

    }

    public static void recall(String str, String ans, int n) {
        if (ans.length() == n) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            recall(str, ans + ch, n);
        }
    }
}
