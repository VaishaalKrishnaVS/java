import java.util.Scanner;
import java.util.Stack;

public class smallestno_fpattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int num = 1;
        scn.close();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'd') {
                st.push(num++);
            } else if (ch == 'i') {
                st.push(num++);
                while (st.size() > 0) {
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while (st.size() > 0)
            System.out.println(st.pop());
    }
}
