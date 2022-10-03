import java.util.Scanner;

public class knighttour {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int chess[][] = new int[n][n];
        int i =1;
        printKnightsTour(chess, r, c, i);
        displayBoard(chess);
        scn.close();
    }

    static int[][] dir = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 },{-2,-1},{-1,-2},{1,-2},{2,-1} };


    public static void printKnightsTour(int[][] chess, int sr, int sc, int upcomingMove) {
        if(upcomingMove==chess.length*chess.length){
            return;
        }

        for(int d =0;d<8;d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < chess.length && c < chess[0].length  && chess[r][c]==0) {
                chess[r][c] = upcomingMove;
                printKnightsTour(chess, r, c, upcomingMove++);

                
            }
        }
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}