import java.util.HashMap;
import java.util.Scanner;

public class msw{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();
        String ans = minstr(s,t);
        scn.close();
        System.out.println(ans);
    }

    public static String minstr(String s, String t){
        String ans="";

        int i =-1;
        int j =-1;

        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch:t.toCharArray()) map2.put(ch,map2.getOrDefault(ch, 0)+1);

        int mt = 0;
        int dmt = t.length();

        HashMap<Character,Integer> map1 = new HashMap<>();

        while(true){
            boolean b1=true;
            boolean b2=true;
            //include
            while(i<s.length()-1&&mt<dmt){
                i++;
                char ch = s.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0)+1);
                if(map1.get(ch)<=map2.getOrDefault(ch, 0)) mt++;
                b1=false;

            }
            //exclude
            while(j<i&&mt==dmt){
                String temp = s.substring(j+1, i+1);
                if(ans.length()==0||temp.length()<ans.length()) ans = temp;
                j++;
                char ch = s.charAt(j);
                if(map1.get(ch)==1) map1.remove(ch);
                else map1.put(ch, map1.get(ch)-1);
                if(map1.getOrDefault(ch, 0)<map2.getOrDefault(ch, 0)) mt--;
                b2=false;
            }

            if(b1&&b2) break;
        }

        return ans;
    }
}
/*
 

 */
  