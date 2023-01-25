import java.util.Scanner;

public class pattern {
    // public static void main(String[] args) {
    // for (int i = 1; i < 8; i+=2) {
    // for (int j = 0; j <= i; j+=2) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int a = scn.nextInt();
    //     int b = scn.nextInt();
    //     int c = scn.nextInt();
    //     System.out.println(a>b?(a>c?a:c):(b>c?b:c));
    //     scn.close();
        
    // }

    // public static int reverse (int n){
    //     int m=0;
    //     int re=0; 
    //     int d=n;
    //     while(d!=0){
    //         re = d%10;
    //         m=m*10+re;
    //         d/=10;
    //     }
    //     return m;

    // }

    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int a = scn.nextInt();
    //     int ra = reverse(a);
    //     System.out.println(ra);
    //     int as= a*a;
    //     System.out.println(as);
    //     int ras = ra*ra;
    //     System.out.println(ras);
    //     int reas = reverse(ras);
    //     System.out.println(reas);
    //     if(reas==ras) System.out.println("this is adam no");
    //     else System.out.println("this is not adam no");
    // }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();


    }
}
