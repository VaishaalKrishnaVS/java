import java.util.Scanner;

//boxes
public class permo2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int box = scn.nextInt();
        int item = scn.nextInt();
        scn.close();
        recall(1, box, 0, item, "", new int[item]);

    }

    public static void recall(int cb, int tb, int ip, int ti, String ans, int arr[]) {
        if (cb > tb) {
            if (ip == ti)
                System.out.println(ans);
            return;
        }
        if (ip < ti) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                    recall(cb + 1, tb, ip + 1, ti, ans + (i + 1), arr);
                    arr[i] = 0;
                }
            }
        }
        recall(cb + 1, tb, ip, ti, ans + "0", arr);
    }
}
