public class quuencombo2 {
    public static void main(String[] args) {
        int n = 2;
        // queen chooses
        boolean arr[][] = new boolean[n][n];
        recall(0, n, arr);
    }

    public static void recall(int cq, int tq, boolean arr[][]) {
        if (cq == tq) {
            for (boolean r[] : arr) {
                for (boolean el : r) {
                    System.out.print(el ? "q " : "- ");
                }
                System.out.println();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == false) {
                    arr[i][j] = true;
                    recall(cq + 1, tq, arr);
                    arr[i][j] = false;
                }
            }
        }

        
    }
}
