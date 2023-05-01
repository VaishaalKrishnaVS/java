public class pat {
    public static void main(String[] args) {
        int n = 8;
        int nosp = n;
        int nost = 1;
        for (int i = 0; i <= 2 * n; i++) {
            for (int j = 0; j < nosp; j++)
                System.out.print(" ");
            char ch ='a';
            for (int j = 0; j < nost; j++) {
                System.out.print(ch++);
            }
            if (i < n) {
                nosp--;
                nost += 2;
            } else {
                nosp++;
                nost -= 2;
            }
            System.out.println();
        }
    }
}