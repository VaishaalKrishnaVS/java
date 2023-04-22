public class ratinmaze {
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        int ans[][] = new int[maze.length][maze.length];
        recall(0,0,ans,maze);
    }
    public static void print(int arr[][]){
        for(int[]ar:arr){
            for(int el:ar) System.out.print(el+" ");
            System.out.println();
        }
    }
    public static void recall(int i, int j, int ans[][], int maz[][]){
        if(i==ans.length-1&&j==ans.length-1){
            ans[i][j]=1;
            print(ans);
            return;
        }
        if(i<0||i==ans.length||j<0||j==ans.length) return;
        if(ans[i][j]==1) return;
        if(maz[i][j]==0) return;
        ans[i][j]=1;
        
        recall(i+1, j, ans, maz);
        recall(i, j+1, ans, maz);
        ans[i][j]=0;
    }
}
