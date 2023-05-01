import java.util.Scanner;

public class allrep {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = scn.nextInt();
        int ans = arr[0];
        for(int i=1;i<n;i++){
            ans^=arr[i];
        }
        System.out.println(ans);
        scn.close();

    }
}
