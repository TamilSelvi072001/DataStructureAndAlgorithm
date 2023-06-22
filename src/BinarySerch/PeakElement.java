package BinarySerch;
public class PeakElement {
    public static void main(String[] args) {
        int arr[]={1,2,2
            
            ,1};
        int ans=peakElement(arr,arr.length);
        if(ans==-1) System.out.println("0");
        else  System.out.println("1");
    }
    public static int peakElement(int[] arr,int n)
    {
          if(n==1) return 0;
          //check for 1st element
          if(arr[0]>=arr[1]) return 0;
          //check for last element
          if(arr[n-1]>=arr[n-2]) return n-1;
          int low=1,high=n-2;
          while(low<=high){
              int mid=low+high/2;
              //if mid is peak
              if( arr[mid]>=arr[mid-1]  && arr[mid]>=arr[mid+1]){
                  return mid;
              }
              //if peak lies in right
              else if( arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
                  low=mid+1;
              }
              //if peak lies in left
              else{
                  high=mid-1;
              }
          }
          return -1;
    }
}
