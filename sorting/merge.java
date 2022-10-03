import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ar1[] = new int[n];
        for(int i = 0;i<n;i++){
            ar1[i]=scn.nextInt();
        }
        int m = scn.nextInt();
        int ar2[] = new int[m];
        for(int i = 0;i<m;i++){
            ar2[i]=scn.nextInt();
        }
        int arr[]  = mergeA(ar1,ar2);
        print(arr);
        scn.close();

    }
    public static int[] mergeA(int a[], int b[]){
        int mer[] = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j])
            mer[k++] = a[i++];
            else
            mer[k++] = b[j++];
        }
        while(i<a.length){
            mer[k++]=a[i++];
        }
        while(j<b.length){
            mer[k++]=b[j++];
        }
        return mer;
    }
    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
          System.out.println(arr[i]);
        }

}}
