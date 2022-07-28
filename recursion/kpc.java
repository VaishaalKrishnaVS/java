import java.util.ArrayList;
import java.util.Scanner;

public class kpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        ArrayList<String> p = getKPC(str);
        System.out.println(p);

    }

    static String[] arr = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> name = new ArrayList<>();
            name.add("");
            return name;
        }
        char ch = str.charAt(0);
        ArrayList<String> rans = getKPC(str.substring(1));

        ArrayList<String> ans = new ArrayList<>();
        int val = ch - '0';
        String s = arr[val];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (String st : rans)
                ans.add(c + st);
        }
        return ans;
    }
}
