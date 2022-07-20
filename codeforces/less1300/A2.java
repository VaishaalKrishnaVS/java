import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int a = 0, b = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scn.nextInt();
                if (arr[i][j] == 1) {
                    a = i + 1;
                    b = j + 1;
                }
            }
        }
        scn.close();
        int ans = Math.abs(a - 3) + Math.abs(b - 3);
        System.out.println(ans);
    }
}
