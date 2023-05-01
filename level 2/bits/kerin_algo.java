import java.util.Scanner;

public class kerin_algo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int ans=0;
        while(n!=0){
            ans++;
            n = n-(n&((~n)+1));
        }
        System.out.println(ans);
    }
}
