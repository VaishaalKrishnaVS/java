import java.util.Scanner;

public class arrangeb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int b = 1;
        int s = 1;
        while (--n > 0) {
            int nb = s;
            int ns = b + s;
            b = nb;
            s = ns;
        }
        int ans = b + s;
        System.out.println(ans * ans);
    }
}
