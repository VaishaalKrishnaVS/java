public class suminrotsrtarr{
    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int X = 16;
  
        if (sol(arr, X))
            System.out.print("true");
        else
            System.out.print("false");
    }

    public static boolean sol(int arr[],int k){
        int i =0;
        for(i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i])
            break;
        }
        int max =i;
        int min = (i+1);

        while(max!=min){
            int v = arr[max]+ arr[min];
            if(v==k) return true;
            else if(v<k) min= (min+1)%arr.length;
            else if(v>k) max=  (max-1+arr.length)%arr.length;
        }
        return false;
    }
}