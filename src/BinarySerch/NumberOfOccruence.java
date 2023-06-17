package BinarySerch;

import java.util.ArrayList;

public class NumberOfOccruence {
     public static void main(String[] args) {
        int n=9, x=5;
        int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int ans=count( arr,  n,  x);
        System.out.print(ans);

    }
     static int count(int[] arr, int n, int x) {
        return (countOccurrence(arr, n, x));
    }
    static int firstOccurrence(int[] arr, int n, int x){
        int low=0,high=n-1,first=-1;
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
    static int lastOccurrence(int[] arr, int n, int x){
        int low=0,high=n-1,last=-1;
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
    static int countOccurrence(int[] arr, int n, int x){
        if((firstOccurrence(arr, n, x))==-1) return 0;
        return (lastOccurrence(arr, n, x)-(firstOccurrence(arr, n, x))+1);
    }
}
