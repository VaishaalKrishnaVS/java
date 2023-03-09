import java.util.Scanner;

public class per {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        printPermo(str, "");
    }

    public static void printPermo(String s, String ans){

        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            String l = s.substring(0, i);
            String r = s.substring(i+1);
            String res = l+r;
            printPermo(res, ans+ch);
        }
    }
}
