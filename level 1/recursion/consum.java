import java.util.Arrays;

public class consum {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }

    public static void printTriangle(int[] arr){

        if(arr.length<1)
        return;

        int ans[] = new int[arr.length-1];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr[i]+arr[i+1];
        }
        printTriangle(ans);
        System.out.println(Arrays.toString(ans));
    }
}
