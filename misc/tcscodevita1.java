public class tcscodevita1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 10, 11, 3, 6, 16 };
        int sum = 0;
        for (int x : arr)
            sum += x;
        System.out.println(recall(arr, arr.length, 0, sum));

    }

    public static int recall(int arr[], int i, int ans, int sum) {
        if (i == 0)
            return Math.max(ans, sum - ans);
        int n = recall(arr, i - 1, ans + arr[i - 1], sum);
        int m = recall(arr, i - 1, ans, sum);
        return Math.min(n, m);
    }
}
