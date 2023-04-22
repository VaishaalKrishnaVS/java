public class abbr {
    public static void main(String[] args) {
        String str = "abcd";
        recall(str,"",0,0);
    }

    public static void recall(String str, String asf, int c, int i) {
        if (i == str.length()) {
            if (c != 0)
                asf += c;
            System.out.println(asf);
            return;
        }
        String nasf = asf;
        if (c != 0)
            nasf += c;
        nasf += str.charAt(i);

        recall(str, nasf, 0, i + 1);
        recall(str, asf, c + 1, i + 1);
    }
}
