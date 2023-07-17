package BitManipulation;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int n=4,m=5;
        int ans[]=swap(n,m);
        System.out.println(ans[0]+ " " + ans[1]);
    }
    private static int[] swap (int n,int m){
        n=n^m;
        m=n^m;
        n=n^m;
        return new int[] {n,m};
    }

    //  private static int[] swap (int n,int m){
    //     n=n+m;
    //     m=n-m;
    //     n=n-m;
    //     return new int[] {n,m};
    // }
}
