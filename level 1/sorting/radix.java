import java.util.Scanner;

public class radix{
    public static void radixSort(int[] arr) {
        int max  = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        int exp = 1;
        while(exp<=max){
            countSort(arr, exp);
            exp*=10;
        }    
      }
    
      public static void countSort(int[] arr, int exp) {
        int freq[]= new int[10];
         
        for(int i = 0;i<arr.length;i++){
            freq[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i] += freq[i-1];
        }
        int anss[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            int a = arr[i];
            int ind = freq[(a/exp)%10] -1;
            anss[ind] = a;
            freq[(a/exp)%10]--;
        }
        for(int i =0;i<arr.length;i++){
            arr[i] = anss[i];
        }
        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
      }
    
      public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
    
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
        scn.close();
      }
}