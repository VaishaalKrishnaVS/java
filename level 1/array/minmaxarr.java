import java.util.Scanner;

public class minmaxarr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String arr[] = scn.nextLine().split(" ");

        for (int i = 0; i < arr.length / 2; i += 2) {
        insertAt(arr, arr[arr.length - 1], i);
        }

        for (String x : arr) {
            System.out.println(x);
        }
        scn.close();
    }

    public static void insertAt(String arr[], String val, int pos) {
        for (int i = arr.length - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
            if (i == pos+1)
                arr[--i] = val;
        }

    }
}
