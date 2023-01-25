package t2;

public class dup {
    public static void main(String[] args) {
        String str = "avatar";
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 1)
                System.out.println((char) ('a' + i));
        }
        sun();
    }

    public static void sun() {
        int arr[] = new int[] { 1, 4, 20, 3, 10, 5 };
        int s = 2;
        int e = 4;
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
