import java.util.*;

public class crossword {

    public static void solution(char[][] arr, String[] words, int vidx) {
        if(vidx==words.length){
            print(arr);
            return;
        }
        String w = words[vidx];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='-'||arr[i][j]==w.charAt(0)){
                    if(canH(arr, i, j, w)){
                        boolean v[] = new boolean[w.length()];
                        //placeH
                        solution(arr, words, vidx+1);
                        //unplaceH
                    }
                    if(canV(arr, i, j, w)){
                        boolean v[] = new boolean[w.length()];
                        //placeV
                        solution(arr, words, vidx+1);
                        //unplaceV
                    }
                }
            }
        }

    }

    public static boolean canV(char arr[][], int i, int j, String s) {
        int idx = 0;
        while (idx < s.length()) {
            if (i + idx < arr.length && (arr[i + idx][j] == '-' || arr[i + idx][j] == s.charAt(idx)))
                idx++;
            else
                return false;
        }
        if ((i + idx == arr.length || arr[i + idx][j] == '+') && (i - 1 == -1 || arr[i - 1][j] == '+'))
            return true;
        else
            return false;
    }

    public static boolean canH(char arr[][], int i, int j, String s) {
        int idx = 0;
        while (idx < s.length()) {
            if (j + idx < arr.length && (arr[i][j+idx] == '-' || arr[i ][j + idx] == s.charAt(idx)))
                idx++;
            else
                return false;
        }
        if ((j + idx == arr.length || arr[i ][j + idx] == '+') && (j - 1 == -1 || arr[i][j-1] == '+'))
            return true;
        else
            return false;
    }

    public static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] arr = new char[10][10];
        for (int i = 0; i < arr.length; i++) {
            String str = scn.next();
            arr[i] = str.toCharArray();
        }
        int n = scn.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = scn.next();
        }
        solution(arr, words, 0);
    }
}