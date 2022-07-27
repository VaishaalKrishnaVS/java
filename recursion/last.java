import java.util.Scanner;

public class last {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();
        int ans = lasInd(arr, x, 0);
        System.out.println(ans);
    }

    public static int lasInd(int arr[], int x, int ind) {
        if (ind == arr.length)
            return -1;
        int ans = lasInd(arr, x, ind + 1);
        if (ans != -1)
            return ans;
        else {
            if (arr[ind] == x)
                return ind;
            else
                return -1;
        }

    }
}
