import java.util.Scanner;

public class printsubseq {
    public static void main(String[] args) throws Exception {
        Scanner scn  = new Scanner(System.in);
        String  str = scn.next();
        printSS(str, "");
        scn.close();
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        String r = str.substring(1);
        printSS(r, ans+ch);
        printSS(r, ans);
    }
}
