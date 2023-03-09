
import java.util.Scanner;

public class informatica {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(codeHere(s));

    }

    public static String codeHere(String inputData) {
        // Use this function to write your solution;
        String ans = "";
        int n = inputData.length();
        if (n < 3)
            return "TANTRUM";

        if (n == 3)
            return inputData;

        String f = "";
        String s = "";
        String th = "";

        if (n % 2 != 0) {
            f = inputData.substring(0, n / 2);
            s = inputData.substring((n / 2),(n/2)+1);
            th = inputData.substring(n / 2+1);
        } else {
            f = inputData.substring(0, (n / 2)-1);
            s = inputData.substring((n / 2)-1, (n / 2) + 1);
            th = inputData.substring((n / 2) + 1);
        }
        
        ans = rev(f) + s + rev(th);

        return ans;
    }

    public static String rev(String str) {
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }
}
