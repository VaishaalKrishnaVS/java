import java.util.Scanner;

public class toogle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str){
        String s = "";
        for (int i=0;i<str.length();i++){
            char c =str.charAt(i);
            if(c<95){
                c+=32;
            }
            else{
                c-=32;
            }
            s+=c;
        }
        return s;
    }
}
