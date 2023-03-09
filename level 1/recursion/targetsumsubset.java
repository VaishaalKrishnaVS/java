import java.util.Scanner;

public class targetsumsubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        scn.close();
        printSub(arr, 0, "", 0, tar);
    }

    public static void printSub(int arr[], int ind, String set, int sum, int tar) {

        if (arr.length == ind) {
        if (sum == tar) {
        System.out.println(set + ".");
        }
        return;
        }

        if (sum > tar) {
        return;
        }

        // if (arr.length == ind) {
        //     System.out.println(set);
        //     return;
        // }  for printing all subsets


        printSub(arr, ind + 1, set + arr[ind] + ", ", sum + arr[ind], tar);
        printSub(arr, ind + 1, set, sum, tar);
    }
}
