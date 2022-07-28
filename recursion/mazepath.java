import java.util.ArrayList;
import java.util.Scanner;

public class mazepath {
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

        if (sc + 1 <= dc)
            h = getMazePaths(sr, sc + 1, dr, dc);
        if (sr + 1 <= dr)
            v = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> ans = new ArrayList<>();
        for (String s : h)
            ans.add('h' + s);
        for (String s : v)
            ans.add('v' + s);
        return ans;
    }
}
