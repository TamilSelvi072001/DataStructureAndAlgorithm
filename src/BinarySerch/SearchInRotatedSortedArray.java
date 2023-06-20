package BinarySerch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = { 3,4,5,1,2 };
        int ans=search( arr,  0,arr.length,2);
        System.out.print(ans);

    }
    static int search(int A[], int l, int h, int key)
    {
         int low=0,high=A.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==key) return mid;
            if(A[low]<=A[mid]){
                if(A[low]<=key && A[mid]>=key){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }  
            }
            else{
                if( A[mid]<=key && A[high]>=key){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1; 
    }
}
