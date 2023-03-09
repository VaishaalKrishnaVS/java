import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class infix {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operator.push(ch);
            } else if (Character.isDigit(ch)) {
                operand.push(ch - '0');
            } else if (ch == ')') {
                while (operator.size() > 0 && operator.peek() != '(') {
                    int val2 = operand.pop();
                    int val1 = operand.pop();
                    char c = operator.pop();
                    int val = value(c, val1, val2);
                    operand.push(val);
                }
                operator.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operator.size() > 0 && operator.peek() != '(' && priority(ch) <= priority(operator.peek())) {
                    int val2 = operand.pop();
                    int val1 = operand.pop();
                    char c = operator.pop();
                    int val = value(c, val1, val2);
                    operand.push(val);
                }
                operator.push(ch);
            }

        }
        while (operator.size() > 0) {
            int val2 = operand.pop();
            int val1 = operand.pop();
            char c = operator.pop();
            int val = value(c, val1, val2);
            operand.push(val);
        }
        System.out.println(operand.pop());
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

    public static int priority(char ch) {
        if (ch == '=' || ch == '-')
            return 1;
        else if (ch == '/' || ch == '*')
            return 2;
        else
            return 0;
    }
}
