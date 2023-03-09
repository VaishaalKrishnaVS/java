import java.util.Scanner;
import java.util.Stack;

public class postfix_eval_conv {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        Stack<Integer> st = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<String> inf = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                st.push(ch - '0');
                pre.push(ch + "");
                inf.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int val2 = st.pop();
                int val1 = st.pop();
                char op = ch;
                int val = value(op, val1, val2);
                st.push(val);

                String pre2 = pre.pop();
                String pre1 = pre.pop();
                pre.push(op + pre1 + pre2);

                String in2 = inf.pop();
                String in1 = inf.pop();
                inf.push("(" + in1 + op + in2 + ")");
            }
        }
        System.out.println(st.pop());
        System.out.println(inf.pop());
        System.out.println(pre.pop());
        scn.close();

    }

    public static int value(char ch, int val1, int val2) {
        if (ch == '+')
            return val1 + val2;
        else if (ch == '-')
            return val1 - val2;
        else if (ch == '*')
            return val1 * val2;
        else
            return val1 / val2;
    }
}
