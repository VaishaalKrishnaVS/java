import java.util.*;

public class subdomain {

    public static List<String> subdomainVisits(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            int v = Integer.parseInt(s.split(" ")[0]);
            String ad = s.split(" ")[1];
            String c = ad.split("\\.")[2];
            String d = ad.split("\\.", 2)[1];
            map.put(ad, map.getOrDefault(ad, 0) + v);
            System.out.println(ad+" "+map.get(ad));
            map.put(c, map.getOrDefault(c, 0) + v);
            System.out.println(c + " " + map.get(c));

            map.put(d, map.getOrDefault(d, 0) + v);
            System.out.println(d + " " + map.get(d));

        }
        ArrayList<String> ls = new ArrayList<String>();
        for (String k : map.keySet()) {
            int val = map.get(k);
            String ans = val + " " + k;
            ls.add(ans);
            
        }

        return ls;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] cpd = new String[n];
        for (int i = 0; i < cpd.length; i++) {
            cpd[i] = s.nextLine();
        }
        List<String> ans = subdomainVisits(cpd);
        Collections.sort(ans);
        System.out.println(ans);
        s.close();
    }

}
