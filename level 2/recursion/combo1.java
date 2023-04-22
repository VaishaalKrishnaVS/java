public class combo1 {
    public static void main(String[] args) {
        int boxes = 5;
        int items =3;
        recall(1,boxes,0,items,"");
    }
    public static void recall(int cb, int tb, int cs, int ts,String ans){
        if(cb>tb){
            if(cs==ts) System.out.println(ans);
            return;
        }
        recall(cb+1,tb,cs+1,ts,ans+"i");
        recall(cb+1,tb,cs,ts,ans+"-");
    }
}
