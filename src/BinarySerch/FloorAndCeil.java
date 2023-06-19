package BinarySerch;

import java.util.Arrays;

public class FloorAndCeil {
     static int[] getFloorAndCeil(int[] arr, int n, int x) {
          Arrays.sort(arr);
          int ans[]=new int[2];
         int floor=-1,ceil=-1;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                floor=mid;
               low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        
        low=0;
        high=n-1;
         while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<x){
                
               low=mid+1;
            }
            else {
               ceil=mid;
                high=mid-1;
            }
        }
        floor=(floor==-1) ? -1:arr[floor];
        ceil=(ceil==-1)? -1:arr[ceil];
        ans[0]=floor;
        ans[1]=ceil;
        return ans;
    }
    
    public static void main(String[] args) {
            int[] arr={5, 6, 8, 9, 6, 5, 5, 6};
            int n=8;
            int x=7;
            int ans[]=new int[2];
            ans=getFloorAndCeil(arr, n, x);
            System.out.print(ans[0] + " " + ans[1]);
    }
}
