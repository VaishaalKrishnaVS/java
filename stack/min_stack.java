import java.util.Stack;

public class min_stack {
    public static class Minstack {
        Stack<Integer> data;
        int min;

        public Minstack() {
            data = new Stack<>();
        }

        int size() {
            return data.size();
        }

        void push(int val) {
            if (size() == 0) {
                data.push(val);
                min = val;
            } else if (val < min) {
                data.push(val + val - min);
                min = val;
            } else {
                data.push(val);
            }
        }

        int pop() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                if (data.peek() < min) {
                    int oval = min;
                    min = 2 * min - data.pop();
                    return oval;
                } else {
                    return data.pop();
                }
            }
        }

        int top() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                if (data.peek() >= min)
                    return data.peek();
                else
                    return min;
            }
        }

        int min() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else
                return min;
        }
    }
}
