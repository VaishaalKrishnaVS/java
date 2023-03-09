import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();
        while(tests-->0){
            int r = scn.nextInt();
            int c = scn.nextInt();
            int n =Math.max(r,c);
            int arr[][] = new int[n][n];
            int i=1;
            int cc=0;
            int cr=0;
            while(i<=n*n){
                arr[r][c]=scn.nextInt();
            }
        }
    }
}
