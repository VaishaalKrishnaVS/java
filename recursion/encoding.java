import java.util.Scanner;

public class encoding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        printEncoding(str,"");

    }

    public static void printEncoding(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if(ch=='0'){
            return;
        }
        printEncoding(str.substring(1), ans +(char)(ch -'1'+'a'));

        if(str.length()>=2){
            String st = str.substring(0, 2);
            int a = Integer.parseInt(st);
            if(a<=26){
                printEncoding(str.substring(2), ans +(char)(a-1+'a'));
            }
        }
    }
}
