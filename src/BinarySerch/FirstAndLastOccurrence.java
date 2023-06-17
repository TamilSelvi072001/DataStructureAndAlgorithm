package BinarySerch;

import java.util.ArrayList;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int n=9, x=5;
        long arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        ArrayList<Long> ans=find(arr,n,x);
        System.out.print(ans.get(0)+" "+ans.get(1));
    }
    static ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> ans=new ArrayList<Long>();
        Long first=(firstOccurrence(arr, n, x));
        if(first==-1) 
        {
            ans.add(-1l);
            ans.add(-1l);
            return ans;
        }
        Long last=lastOccurrence(arr, n, x);
        ans.add(first);
        ans.add(last);
        return ans;
    }
    static Long firstOccurrence(long[] arr, int n, int x){
        int low=0,high=n-1;
        long first=-1l;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    static Long lastOccurrence(long[] arr, int n, int x){
        int low=0,high=n-1;
        long last=-1l;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
}
