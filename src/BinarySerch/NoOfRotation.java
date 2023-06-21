package BinarySerch;

public class NoOfRotation {
    //Number of rotations made in a sorted array
    private static int findKRotation(int arr[], int n) {
        int min=Integer.MAX_VALUE;
        int temp=0;
        int low=0,high=n-1,ind=0;
       //if array is sorted
        if(arr[low]<arr[high]){
            return low;
        }
       while(low<=high){
           int mid=low+(high-low)/2;
           //left sorted
           if(arr[low]<=arr[mid]){
                if(min>arr[low]){
                    min=arr[low];
                    ind=low;
                }
                low=mid+1;
           }
           //right sorted
          else{
                if(min>arr[mid]){
                    min=arr[mid];
                    ind=mid;
                }
                high=mid-1;
          }
       }
       return ind;
    }
     public static void main(String[] args) {
        int arr[]={7,8,9,2,3,4,5,6};
        System.out.println(findKRotation(arr,arr.length));
    }
}
