
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inverse {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static int[] invers(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int val = a[i];
            b[val] = i;

        }
        return b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = invers(a);
        display(inv);
    }
}
