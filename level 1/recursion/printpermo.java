import java.util.Scanner;

public class printpermo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        printPermo(str, "");

    }

    public static void printPermo(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String res = left + right;
            printPermo(res, ans + ch);
        }
    }
}