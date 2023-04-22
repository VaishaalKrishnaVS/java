public class queencombo1 {
    public static void main(String[] args) {
        int n=2;
        //box chooses
        recall(0,n,0,0,"");
    }
    public static void recall(int qsf, int tq, int r, int c, String ans){
        if(r==tq){
            if(qsf==tq) System.out.println(ans);
            return;
        }
        recall(qsf+1,tq,c==tq-1?r+1:r,c==tq-1?0:c+1,c==tq-1?ans+"q\n":ans+"q");
        recall(qsf,tq,c==tq-1?r+1:r,c==tq-1?0:c+1,c==tq-1?ans+"-\n":ans+"-");
    }
}