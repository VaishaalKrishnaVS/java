import java.util.Scanner;

public class rbm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int m = ~n;
        m++;
        m=n&m;
        System.out.println(Integer.toBinaryString(m));
    }
}
