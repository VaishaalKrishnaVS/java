import java.util.Scanner;

public class multr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        scn.close();
        int cp = 0;
        int sp = 0;
        int p = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                p += arr[sp] - arr[cp];
                cp = sp = i;
            } else
                sp++;
        }
        p += arr[sp] - arr[cp];
        System.out.println(p);
    }
}
