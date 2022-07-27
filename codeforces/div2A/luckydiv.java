import java.util.Scanner;

public class luckydiv {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int arr[] = {4,7,47,74,44,77,444,447,474,477,744,747,774,777};
        int count=1;
        for(int i= 0;i<arr.length;i++){
            if(n%arr[i]==0)
            count++;
        }
        if(count>1)
        System.out.println("YES");
        else
        System.out.println("NO");

    }
}
