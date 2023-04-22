public class fp2 {
    public static void main(String[] args) {
        int n = 4;
        boolean usd[] = new boolean[n];
        recall(0, n, usd, "");
    }

    public static void recall(int i, int t, boolean usd[], String ans) {
        if (i == t) {
            System.out.println(ans);
            return;
        }

        if (usd[i])
            recall(i + 1, t, usd, ans);
        else {
            recall(i + 1, t, usd, ans + "(" + i + ")");
            for (int j = i + 1; j < t; j++) {
                if (!usd[j]) {
                    usd[j] = true;
                    recall(i + 1, t, usd, ans + "(" + i + j + ")");
                    usd[j] = false;
                }
            }
            usd[i] = false;
        }

    }
}
