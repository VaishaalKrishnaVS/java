import java.util.ArrayList;
import java.util.Scanner;

public class stairspath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (n < 0) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        ArrayList<String> rans1 = getStairPaths(n - 1);
        ArrayList<String> rans2 = getStairPaths(n - 2);
        ArrayList<String> rans3 = getStairPaths(n - 3);

        ArrayList<String> ans = new ArrayList<>();

        for (String string : rans1) {
            ans.add(1 + string);
        }
        for (String string : rans2) {
            ans.add(2 + string);
        }
        for (String string : rans3) {
            ans.add(3 + string);
        }
        return ans;
    }
}
