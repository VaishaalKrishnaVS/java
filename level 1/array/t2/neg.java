package t2;

public class neg {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, -3, 4, -5 };

        int s = 0;
        int e = 4;
        while (s < e) {
            while (arr[s] < 0)
                s++;
            while (arr[e] > 0)
                e--;
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
        swap(arr);
        for (int i : arr)
            System.out.print(i);

    }

    public static void swap(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int iemp = arr[i];
            arr[i] = arr[j];
            arr[j] = iemp;
            i++;
            j--;
        }
    }

    public static void count(int arr[], int l) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == l)
                count++;
        }
        System.out.println(count);
    }
}
