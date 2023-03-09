public class group_ones {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,0,0,1};
        int o =0;
        for(int x:arr) o+=x;
        int ow =0;
        for(int i=0;i<o;i++)ow+=arr[i];
        int ans=0;
        int s=0;
        int e=o;
        while(e<arr.length){
            ans=Math.max(ow,ow-arr[s]+arr[e]);
            ow=ow-arr[s++]+arr[e++];
        }
        System.out.println(o-ans);


    }
}
