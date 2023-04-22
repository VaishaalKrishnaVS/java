import java.util.ArrayList;

public class cc4 {
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8 };
        int tot = 8;

        recall(0, arr, 0, tot, "");
        ans = 0;
        recall1(0, arr, 0, tot);
        System.out.println(ans);
        recall2(0,0, tot, arr, "");
        
    }

    static int ans;

    public static void recall(int i, int arr[], int s, int t, String str) {
        if (i == arr.length) {
            if (s == t)
                System.out.println(str + ".");
            return;
        }
        for (int j = t / arr[i]; j >= 1; j--) {
            String temp = "";
            for (int k = 0; k < j; k++) {
                temp += arr[i] + "-";
            }
            recall(i + 1, arr, s + arr[i] * j, t, str + temp);
        }
        recall(i + 1, arr, s, t, str);
    }

    public static void recall1(int i, int arr[], int amtsf, int tmt) {
        if (i == arr.length) {
            if (amtsf == tmt)
                ans++;
            return;
        }
        if (amtsf == tmt) {
            ans++;
            return;
        }
        if (amtsf > tmt)
            return;
        for (int j = tmt / arr[i]; j >= 1; j--) {
            recall1(i + 1, arr, amtsf + arr[i] * j, tmt);
        }
        recall1(i + 1, arr, amtsf, tmt);
    }

    public static void recall2(int i,int cs, int n, int arr[], String ans){
        if(cs==n){
            System.out.println(ans);
            return;
        }
        if(cs>n) return;
        if(i==arr.length){
            if(cs==n) System.out.println(ans);
            return;
        }
        //mul add
        for(int j = n / arr[i]; j >= 1; j--){
            String t="";
            for(int k=0;k<j;k++) t+=arr[i]+"-";
            recall2(i+1,cs+arr[i]*j,n,arr,ans+t);
        }
        //exclude
        recall2(i+1,cs,n,arr,ans);
    }

}
