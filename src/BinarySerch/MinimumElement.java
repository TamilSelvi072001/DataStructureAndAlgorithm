package BinarySerch;

public class MinimumElement {
    //minimum element in the sorted rotated array
    public static void main(String[] args) {
        int arr[]={7,8,9,2,3,4,5,6};
        System.out.println(findMin(arr,arr.length));
    }
    private static int findMin(int arr[], int n)
    {
       int min=Integer.MAX_VALUE;
       int low=0,high=n-1;
       //if array is sorted
        if(arr[low]<arr[high]){
            return arr[low];
        }
       while(low<=high){
           int mid=low+(high-low)/2;
           //left sorted
           if(arr[low]<=arr[mid]){
               min=Math.min(min,arr[low]);
               low=mid+1;
           }
           //right sorted
          else{
               min=Math.min(min,arr[mid]);
               high=mid-1;
          }
       }
       return min;
    }
}
