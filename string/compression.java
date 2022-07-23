import java.util.Scanner;

public class compression {
    public static String compression1(String str) {
        StringBuilder sb = new StringBuilder(str.charAt(0) + "");
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char cur = str.charAt(i);
            if (prev == cur) {
            } else {
                sb.append(cur);
            }

        }
        return sb.toString();
    }

    public static String compression2(String str) {
        StringBuilder sb = new StringBuilder(str.charAt(0) + "");
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char cur = str.charAt(i);
            if (prev == cur) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
                sb.append(cur);
            }

        }
        if (count > 1) {
            sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}
