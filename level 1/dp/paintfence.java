import java.util.Scanner;

public class paintfence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        long k = scn.nextInt();
        long ii = k;
        long ij = k * (k - 1);

        for (long i = 3; i <= n; i++) {
            long nii = ij;
            long nij = (ii + ij) * (k-1);

            ii = nii;
            ij = nij;
        }
        System.out.println(ii + ij);
        scn.close();
    }
}
