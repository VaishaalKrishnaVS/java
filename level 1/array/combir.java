public class combir {
    public static void main(String[] args) {

    }

    public static void sol(int arr[], int r, int i, int ans[], int ind) {
        if (ans.length == r) {
            for (int j = 0; j < r; j++) {
                System.out.println(ans[j]);

            }
            return;
        }
        if (i > arr.length)
            return;

        ans[ind] = arr[i];
        sol(arr, r, i + 1, ans, ind + 1);
        sol(arr, r, i + 1, ans, ind);

    }
}
