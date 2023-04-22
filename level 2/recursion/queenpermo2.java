public class queenpermo2 {
    public static void main(String[] args) {
        // box chooses
        int n = 2;
        boolean arr[] = new boolean[n];
        recall(0, n, 0, 0, "", arr);
    }

    public static void recall(int qsf, int n, int r, int c, String ans, boolean arr[]) {
        if (r == n) {
            if (qsf == n)
                System.out.println(ans);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false) {
                arr[i] = true;
                recall(qsf + 1, n, c == n - 1 ? r + 1 : r, c == n - 1 ? 0 : c + 1,
                        c == n - 1 ? ans + "q" + (i + 1) + "\n" : ans + "q" + (i + 1), arr);
                arr[i] = false;
            }
        }
        recall(qsf, n, c == n - 1 ? r + 1 : r, c == n - 1 ? 0 : c + 1,
                c == n - 1 ? ans + "-" + "\n" : ans + "-", arr);

    }
}
