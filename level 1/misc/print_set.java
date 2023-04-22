
//import java.util.HashSet;
import java.util.*;

public class print_set {
    public static void main(String[] args) {
        // HashSet<Integer>set = new HashSet<>();
        // set.add(5);
        // set.add(4);
        // set.add(2);
        // set.add(9);
        // int arr[] = new int[set.size()];
        // int i=0;
        // for(int x:set){
        // arr[i]=x;
        // System.out.print(arr[i++]);
        // }
        String str = "www.google.co\'m"; 
        String arr[] = str.split("\'");
        for(String s:arr) System.out.println(s);
    }
}
