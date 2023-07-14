package BitManipulation;

public class BitSetOrNot {
    public static void main(String[] args) {
        System.out.println(checkKthBit(36,5));
    }
    private static boolean checkKthBit(int n, int k)
    {
        return (n&(1<<k))==1<<k;
    }
}
