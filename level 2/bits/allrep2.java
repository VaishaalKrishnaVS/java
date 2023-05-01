import java.util.ArrayList;
import java.util.Scanner;

public class allrep2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans ^= arr[i];
        }
        System.out.println(ans);
        scn.close();
        int mask = ans&((~ans)+1);
        ArrayList<Integer>z = new ArrayList<>();
        ArrayList<Integer>o = new ArrayList<>();
        for(int i:arr){
            if((mask&i)==mask) o.add(i);
            else z.add(i);
        }
        int n1 = o.get(0);
        int n2 = z.get(0);
        for(int i =1;i<o.size();i++){
            n1^=o.get(i);
        }
        for(int i =1;i<z.size();i++){
            n2^=z.get(i);
        }
        System.out.println(n1+" "+n2);

    }
}
