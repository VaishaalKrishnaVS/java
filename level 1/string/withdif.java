import java.util.Scanner;

public class withdif {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str.charAt(0)+"");
        for (int i = 1; i < str.length(); i++) {
            char prev = str.charAt(i - 1);
            char cur = str.charAt(i);
            sb.append(cur - prev);
            sb.append(cur);
            

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println(solution(str));
    }
}
