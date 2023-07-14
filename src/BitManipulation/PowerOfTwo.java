package BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(567586));
    }
    public static boolean isPowerofTwo(long n){
        if(n<=0) return false;
        return (n&(n-1))==0;       
    }
}
