import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int a = ind(arr, x, 0);
        scn.close();
        System.out.println(a);

    }

    public static int ind(int arr[], int x, int ind) {
        if (ind == arr.length)
            return -1;
        else if (arr[ind] == x)
            return ind;
        else
            return ind(arr, x, ind + 1);
    }
}
