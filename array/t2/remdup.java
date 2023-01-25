package t2;

import java.util.*;

public class remdup {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        StringBuilder s = new StringBuilder();
        str.chars().distinct().forEach(c ->s.append((char)(c)));
    }
}