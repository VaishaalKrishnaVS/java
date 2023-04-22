import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class kdistinstr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        String str = scn.next();
        int ans=0;
        for(int i=0;i<str.length();i++){
            Set<Character>st=new HashSet<>();
            for(int j=i+1;j<=str.length();j++){
                String s = str.substring(i, j);
                for(char ch:s.toCharArray())st.add(ch);
                if(st.size()==k) ans++;
            }
        }
        System.out.println(ans);
        
    }
}
