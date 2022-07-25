import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        if (n % 2 == 0 && n != 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
