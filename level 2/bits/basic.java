import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        isEven(n);
        
    }
    public static boolean isEven(int n){
        if((n&1)==1) return false;
        return true;
    }
    public static int noSB(int n){
        return 0;
    }
    public static boolean kBS(int n, int k){
        int m = (1<<k);
        if((n&m) !=0 ) return true;
        return false;
    }
    public static boolean kBUS(int n, int k){
        int m = (1<<k);
        if((n&m)==0) return true;
        return false;
    }
    public static int flipKB(int n, int k){
        int m = (1<<k);
        int ans = (n^m);
        return ans;
    }
}
