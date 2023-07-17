package BitManipulation;

public class NoOfBitsAtoB {
    public static void main(String[] args){
        int start=1930;
        int goal=2333;
        System.out.print(minBitFlips(start,goal));
    }
    public static int minBitFlips(int start, int goal) {
        int temp=start^goal;
        int count=0;
        while(temp>0){
            if((temp&1)==1){
                count++;
            }
            temp>>=1;
        }
        return count;
    }
}
