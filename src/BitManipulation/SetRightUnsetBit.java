package BitManipulation;
public class SetRightUnsetBit {
    public static void main(String[] args) {
        int N=2345;
        System.out.print(setBit(N));
    }
    private static int setBit(int N){
        return ((N&(N+1))==0)? N:(N|(N+1));
    }
}
