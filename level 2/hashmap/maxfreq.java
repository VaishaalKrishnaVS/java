import java.util.HashMap;
import java.util.Scanner;

class obj {
    int sp;
    int ep;
    int f;

    public obj(int sp, int ep, int f) {
        this.sp = sp;
        this.ep = ep;
        this.f = f;
    }
}

public class maxfreq {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        HashMap<Integer, obj> map = new HashMap<>();
        int i = 0;
        int mf = -1;
        while (i < n) {
            if (map.containsKey(arr[i])) {
                obj g = map.get(arr[i]);
                g.ep=i;
                g.f++;
                map.put(arr[i], g);
            } else
                map.put(arr[i], new obj(i, i, 1));
            if(mf==-1||map.get(arr[i]).f>map.get(mf).f)mf=arr[i];
            else if(map.get(arr[i]).f==map.get(mf).f){
                obj a = map.get(arr[i]);
                obj m = map.get(mf);
                int la = a.ep-a.sp;
                int ma = m.ep-m.sp;
                if(la<ma) mf = arr[i]; 
            }
            i++;
        }
        System.out.println(mf);
        System.out.println(map.get(mf).sp);
        System.out.println(map.get(mf).ep);
    }
}
