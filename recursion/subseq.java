import java.util.ArrayList;
import java.util.Scanner;

public class subseq {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
        scn.close();
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rans = gss(ros);

        ArrayList<String> mans = new ArrayList<>();

        for (String string : rans) {
            mans.add(string);
        }
        for (String string : rans) {
            mans.add(ch + string);
        }
        return mans;

    }
}
