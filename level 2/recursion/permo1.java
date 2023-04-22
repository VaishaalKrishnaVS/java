public class permo1 {
    public static void main(String[] args) {
        int box = 5;
        int obj = 3;
        recall(new int[box], 1, obj);
    }

    public static void recall(int box[], int i, int tot) {
        if (i > tot) {

            for (int el : box) {
                System.out.print(el);
            }
            System.out.println();

            return;
        }

        for (int j = 0; j < box.length; j++) {
            if (box[j] == 0) {
                box[j] = i;
                recall(box, i + 1, tot);
                box[j] = 0;
            }
        }

    }
}
