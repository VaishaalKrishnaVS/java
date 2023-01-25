package t2;

import java.util.Scanner;

public class cons {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();

        for (int i = 0; i < n-1; i++) {
            
            if (arr[i+1]== arr[i]+1) {
                System.out.println(arr[i]);
                if(!(arr[i+1]+1==arr[i+2]))
                System.out.println(arr[i+1]);
            }
        }

        

    }
}
