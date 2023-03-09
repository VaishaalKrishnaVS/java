import java.util.Scanner;

public class vir_gm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        System.out.print(ans(arr,0,n-1));

    }
    
    public static int ans(int[] nums, int left, int right) {
        if (left > right)
            return 0;
        int choice1 = nums[left] + Math.min(ans(nums, left + 2, right), ans(nums, left + 1, right - 1));
        int choice2 = nums[right] + Math.min(ans(nums, left + 1, right - 1), ans(nums, left, right - 2));
        return Math.max(choice1, choice2);
    }
}
