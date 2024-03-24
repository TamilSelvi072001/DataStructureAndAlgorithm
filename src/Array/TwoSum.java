package Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int target=11;
        int sum[]=twoSum(nums,target);
        if(sum.length==2) System.out.print(sum[0]+" "+sum[1]);
        else    System.out.print("Not Found");
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp))   return new int[]{map.get(temp),i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
