import java.util.Scanner;

public class abcsubseq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int a = 0;
        int ab = 0;
        int abc = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a')
                a = 2 * a + 1;
            else if (ch == 'b')
                ab = 2 * ab + a;
            else
                abc = 2 * abc + ab;
        }
        System.out.println(abc);
        scn.close();
    }
}
