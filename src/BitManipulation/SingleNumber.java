package BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[]={10,5,5,10,5,3,3};
        System.out.print(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}
