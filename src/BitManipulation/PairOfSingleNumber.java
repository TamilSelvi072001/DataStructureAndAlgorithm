package BitManipulation;

public class PairOfSingleNumber {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,7,4,5,6};
        int ans[]=twoOddNum(arr);
       System.out.println(ans[0] + " "  + ans[1]);
    }
    public static int[] twoOddNum(int[] arr) {
        int xor = 0, count = 0, xor1 = 0, xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        while (xor != 0) {
            if ((xor & (1 << 0)) != 0) {
                break;
            }
            count++;
            xor >>= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & (1 << count)) != 0) {
                xor1 ^= arr[i];
            } else {
                xor2 ^= arr[i];
            }
        }
        // non-decreasing order - descending order
        if (xor1 > xor2) {
            return new int[] { xor1, xor2 };
        } else {
            return new int[] { xor2, xor1 };
        }

    }
}
