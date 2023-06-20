package BinarySerch;

public class SearchInDuplicateRotatedSortedArray {
     public static void main(String[] args) {
        int arr[] = { 1,3,4,5,1,1,1,1,1 };
        boolean ans=Search( arr.length,arr,1);
        System.out.print(ans);

    }
    public static boolean Search(int N, int[] nums, int target) {
        int low=0,high=N-1;
        while(low<=high){
            int  mid=low+(high-low)/2;
            if(nums[mid]==target) return true;
            // check for duplicate condition
            if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>=target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
                
            }
        }
        return false;
    }
}
