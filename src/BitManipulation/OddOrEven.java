package BitManipulation;

public class OddOrEven {
    public static void main(String[] args) {
        int n=2999;
        System.out.print(oddEven(n));
    }
    static String oddEven(int N){
        if(((1<<0)&N)==(1<<0)){
            return "odd";
        }
        else{
            return "even";
        }
    }
}
