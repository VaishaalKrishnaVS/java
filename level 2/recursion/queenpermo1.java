public class queenpermo1 {
    public static void main(String[] args) {
        int n=2;
        //queen chooses
        int arr[][] = new int[n][n];
        recall(0,n,arr);
    }
    public static void recall(int qsf, int tq, int arr[][]){
        if(qsf==tq){
            for(int r[]:arr){
                for(int el:r){
                    System.out.print(el);
                }
                System.out.println();
            }
            return;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==0){
                    arr[i][j]=qsf+1;
                    recall(qsf+1,tq,arr);
                    arr[i][j]=0;
                }
            }
        }
    }
}
