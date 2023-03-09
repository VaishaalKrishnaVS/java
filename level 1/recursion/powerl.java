import java.util.Scanner;

public class powerl {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m= scn.nextInt();
        int n = scn.nextInt();
        int ans = power(m,n);
        scn.close();
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n==0)
        return 1;
        int ans = x*power(x,n-1);
        return ans;
    }

}
