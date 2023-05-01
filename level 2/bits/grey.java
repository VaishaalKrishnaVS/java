import java.util.ArrayList;
import java.util.Scanner;

public class grey {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String>ans = recall(n);
        for(String s:ans) System.out.println(Integer.parseInt(s,2));
        scn.close();
    }
    public static ArrayList<String> recall(int n){

        if(n==0){
            ArrayList<String>al = new ArrayList<>();
            al.add("");
            return al;
        }
        ArrayList<String>al = recall(n-1);
        ArrayList<String>ans = new ArrayList<>();
        for(String s:al){
            ans.add("0"+s);
        }
        for(int i=al.size()-1;i>=0;i--){
            ans.add(1+al.get(i));
        }
        
        return ans;
    }
}
