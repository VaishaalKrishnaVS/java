import java.util.Scanner;

public class dobstr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String inparr[] = new String[n];
        for (int i = 0; i < n; i++) {
            inparr[i] = scn.next();
        }
        int h = 0;
        while (h < n) {
            String str = inparr[h];
            char arr[] = new char[str.length() * 2];
            int j = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                arr[j++] = ch;
                arr[j++] = ch;

            }
            char ans[] = new char[arr.length];
            for (int i = 0; i < arr.length; i += 2) {
                char ch = arr[i];
                ans[i] = ch;
                ans[arr.length - 1 - i] = ch;
            }
            String s = new String(ans);
            System.out.println(s);
            h++;
        }

        scn.close();

    }
}
