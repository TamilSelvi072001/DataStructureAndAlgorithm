package BinarySerch;

public class SearchInsertPositionOfK {
    public static void main(String[] args) {
        int arr[]={3,6,7,8,9,10,40};
        int ans=searchInsertK(arr, arr.length,11);
        System.out.println(ans);
    }
    public static int searchInsertK(int Arr[], int N, int k)
    {
        //same as lower bound
        int low=0;
        int high= N-1;
        int ans=N;
        while(low<=high){
            int mid=low+(high-low)/2;
           if(Arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else{
               low=mid+1;
            }
            
        }
        return ans;
    }
}
