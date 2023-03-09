public class mergetopalin{
    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 5, 9, 1} ;
        System.out.println("Count of minimum operations is "+
                                findMinOps(arr, arr.length));
    }

    public static int findMinOps(int arr[], int n){
        int i=0;
        int j= n-1;
        int ans=0;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]>arr[j]){
                j--;
                arr[j]+=arr[j+1];
                ans++;
            }
            else{
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }
        }
        return ans;
    }
}