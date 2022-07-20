

// total no of subsets = 2^n
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class subset {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int maxi = (int) Math.pow(2, n);
        for (int i = 0; i < maxi; i++) {
            int temp = i;
            String str = "";
            for (int j = n - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;
                if (rem == 0) {
                    str = "-" + "\t" + str;
                } else {
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }

    }
}
