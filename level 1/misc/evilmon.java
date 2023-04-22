import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class evilmon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d[][] = new int[n][3];
        int m = scn.nextInt();
        int h[][] = new int[m][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                d[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                h[i][j] = scn.nextInt();
            }
        }
        int tot = 0;
        HashMap<Integer, ArrayList<Integer>> dm = new HashMap<>();
        for (int[] r : d) {
            for (int i = r[0]; i <= r[1]; i++) {
                if (dm.containsKey(i)) {
                    ArrayList<Integer> al = dm.get(i);
                    al.add(r[2]);
                    dm.put(i, al);
                    tot++;
                } else {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(r[2]);
                    dm.put(i, al);
                    tot++;
                }
            }
        }
        System.out.println(tot);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int r[] : h) {
            int p = r[0];
            int s = r[1];

            if (dm.containsKey(p)) {
                ArrayList<Integer> al = dm.get(p);
                int i=0;
                while(i<al.size()){
                    if(al.get(i)<s){
                        al.remove(i);
                        tot--;
                    }
                    i++;
                }
                dm.put(p,al);
            }
            ans.add(tot);
        }
        System.out.println(ans);
    }
}
