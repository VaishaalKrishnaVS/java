import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        print(arr);
        scn.close();
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
        }
      }

      public static void countSort(int[] arr, int min, int max) {
        int range  = max-min+1;
        int freq[]= new int[range];
        for(int i= 0;i<range;i++){
            freq[i] = 0;
        }
        for(int i = 0;i<arr.length;i++){
            freq[arr[i]-min]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i] += freq[i-1];
        }
        int anss[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            int a = arr[i];
            int ind = freq[a-min] -1;
            anss[ind] = a;
            freq[a-min]--;
        }
        for(int i =0;i<arr.length;i++){
            arr[i] = anss[i];
        }
        
       }
}
