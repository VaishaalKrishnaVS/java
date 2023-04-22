public class combo2 {
    public static void main(String[] args) {
        int b = 5;
        int i = 3;
        recall(new int[b], 1, i, 0);
    }

    public static void recall(int box[], int ci, int ti, int ind) {
        if (ci > ti) {
            for (int el : box)
                System.out.print(el == 0 ? "-" : "i");
            System.out.println();
            return;
        }

        for (int i = ind; i < box.length; i++) {
            if (box[i] == 0) {
                box[i] = 1;
                recall(box, ci + 1, ti, ind + 1);
                box[i] = 0;
            }
        }
    }
}
