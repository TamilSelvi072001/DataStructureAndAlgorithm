package BinarySerch;

public class Floor {
    public static int findFloor(long arr[], int n, long x)
    {  int ans=-1;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                ans=mid;
               low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        long arr[]={3,6,7,8,9,10,40};
        int ans=findFloor(arr, arr.length,11);
        System.out.println(ans);
    }
}
