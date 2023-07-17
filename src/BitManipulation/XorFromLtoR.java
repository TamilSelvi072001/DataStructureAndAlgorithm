package BitManipulation;

public class XorFromLtoR {
    public static void main(String[] args) {
        int L=34,R=56;
        System.out.println(findXOR(L,R));
    }
    public static int findXOR(int L, int R){
        int x=xor(L-1);
        int y=xor(R);
        return x^y;
    }
    // xor for every 4 num forms a pattern
    public static int xor(int n){
        if(n%4==0) return n;
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        return -1;
    }
}
