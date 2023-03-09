import java.util.Scanner;

public class multrfee {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int f = scn.nextInt();
        scn.close();

        int cp = -arr[0];
        int sp = 0;

        for (int i = 1; i < arr.length; i++) {
            int ncp = 0;
            int nsp = 0;

            if (sp - arr[i] > cp)
                ncp = sp - arr[i];
            else
                ncp = cp;

            if (cp + arr[i] - f > sp)
                nsp = cp + arr[i] - f;
            else
                nsp = sp;

            cp = ncp;
            sp = nsp;
        }
        System.out.println(Math.max(cp, sp));
    }
}
