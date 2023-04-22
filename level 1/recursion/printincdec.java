import java.util.Scanner;

public class printincdec {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // pdi(n);
        recall(n);
        scn.close();
    }

    public static void recall(int n){
        if(n==0)return;
        System.out.println(n);
        recall(n-1);
        System.out.println(n);
    }

    // public static void pdi(int n) {
    //     if (n == 0)
    //         return;
    //     System.out.println(n);
    //     pdi(n - 1);
    //     System.out.println(n);
    // }
}
