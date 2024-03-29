import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class merge_intervel {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(new int[] { arr[0][0], arr[0][1] });

        for (int i = 0; i < arr.length; i++) {
            int[] last = ans.get(ans.size() - 1);
            int st = arr[i][0];
            int end = arr[i][1];

            if (st <= last[1])
                last[1] = Math.max(last[1], end);
            else
                ans.add(new int[] { st, end });
        }
        for (int[] val : ans) {
            System.out.println(val[0] + " " + val[1]);
        }
    }
}