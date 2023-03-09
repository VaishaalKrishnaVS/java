import java.util.Scanner;
import java.util.Stack;

public class celeb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        findCeleb(arr);
    }

    public static void findCeleb(int arr[][]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        while (st.size() > 1) {
            int j = st.pop();
            int i = st.pop();
            if (arr[i][j] == 1) {
                st.push(j);
            } else {
                st.push(i);
            }
        }
        int pot = st.pop();
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 0 || arr[pot][i] == 1) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(pot);
        } else
            System.out.println("none");

    }
}
