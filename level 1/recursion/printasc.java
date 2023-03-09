import java.util.Scanner;

public class printasc {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
        scn.close();
        
    }

    public static void printIncreasing(int n) {
        if (n == 0)
            return;
        printIncreasing(n - 1);
        System.out.println(n);
    }
}
