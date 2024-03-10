package BinarySerch;

    public class BasicIterativeBianrySearch {
        public static void main(String[] args) {
            int[] arr={5,6,7,9,20,40};
            int n=6;
            int k=20;
            int ans=binarysearch(arr, n, k);
            System.out.print(ans);
        }
    
        public static int binarysearch(int arr[], int n, int k) {
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]<k) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
