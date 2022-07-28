import java.util.ArrayList;
import java.util.Scanner;

public class maxepathwj {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();
        System.out.println(getMazePaths(0, 0, n - 1, m - 1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> h = new ArrayList<>();
        ArrayList<String> v = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; sc + i <= dc; i++) {
            h = getMazePaths(sr, sc + i, dr, dc);
            for (String s : h) {
                ans.add("h" + i + s);
            }
        }
        for (int i = 1; sr + i <= dr; i++) {
            v = getMazePaths(sr + i, sc, dr, dc);
            for (String s : v) {
                ans.add("v" + i + s);
            }
        }
        for (int i = 1; sc + i <= dc && sr + i <= dr; i++) {
            d = getMazePaths(sr + i, sc + i, dr, dc);
            for (String s : d) {
                ans.add("d" + i + s);
            }
        }
        return ans;
    }
}
