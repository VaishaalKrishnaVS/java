import java.util.Scanner;

class students {
    int roll_no;
    int m1;
    int m2;
    int m3;

    public students(int roll_no, int m1, int m2, int m3) {
        this.roll_no = roll_no;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

    }

    int total;

    public void tot() {
        total = m1 + m2 + m3;
    }
}

public class vir_class {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        students st[] = new students[n];
        for (int i = 0; i < n; i++) {
            int r = scn.nextInt();
            int m1 = scn.nextInt();
            int m2 = scn.nextInt();
            int m3 = scn.nextInt();

            st[i] = new students(r, m1, m2, m3);
            st[i].tot();
        }
        scn.close();
        int highest_total = 0;
        int hm1 = 0, mi1 = 0;
        int hm2 = 0, mi2 = 0;
        int hm3 = 0, mi3 = 0;
        for (students s : st) {
            if (s.total > highest_total)
                highest_total = s.total;
            if (s.m1 > hm1) {
                hm1 = s.m1;
                mi1 = s.roll_no;
            }
            if (s.m2 > hm2) {
                hm2 = s.m2;
                mi2 = s.roll_no;
            }
            if (s.m3 > hm3) {
                hm3 = s.m3;
                mi3 = s.roll_no;
            }
            System.out.println(s.total);
        }
        System.out.println(mi1 + " " + hm1);
        System.out.println(mi2 + " " + hm2);
        System.out.println(mi3 + " " + hm3);
        System.out.println(highest_total);
    }
}