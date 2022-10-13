import java.util.LinkedList;
import java.util.Scanner;

public class sliding_window_max {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        scn.close();

        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            while (q.size() > 0 && arr[i] >= arr[q.getLast()]) {
                q.removeLast();
            }
            q.addLast(i);
        }

        for (int i = k; i < n; i++) {
            System.out.println(arr[q.getFirst()]);

            while (q.size() > 0 && q.getFirst() <= i - k) {
                q.removeFirst();
            }

            while (q.size() > 0 && arr[i] >= arr[q.getLast()]) {
                q.removeLast();
            }
            q.addLast(i);
        }
        System.out.println(arr[q.getFirst()]);
    }
}
