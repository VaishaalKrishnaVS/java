import java.util.Scanner;

public class way_too_long {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = scn.nextLine();
        }
        scn.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= 10) {
                System.out.println(arr[i]);

            } else {
                System.out.print(arr[i].charAt(0));
                System.out.print(arr[i].length() - 2);
                System.out.println(arr[i].charAt(arr[i].length() - 1));
            }

        }
    }
}
