import java.util.ArrayList;

public class kpart{
    public static void main(String[] args) {
        int n =4;
        int k =3;
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        recall(1,n,k,0,ans);
    }
    public static void recall(int i, int n, int k, int s, ArrayList<ArrayList<Integer>> ans){
        if(i==n+1){
            if(s==k){
                for(ArrayList<Integer> al:ans){
                    System.out.print(al+" ");
                }
                System.out.println();
            }
            return;
        }
        for(int j=0;j<ans.size();j++){
            if(ans.get(j).size()==0){
                ans.get(j).add(i);
                recall(i+1, n, k, s+1, ans);
                ans.get(j).remove(ans.get(j).size()-1);
                break;
            }
            else{
                ans.get(j).add(i);
                recall(i+1, n, k, s, ans);
                ans.get(j).remove(ans.get(j).size()-1);
            }
        }
    }
}