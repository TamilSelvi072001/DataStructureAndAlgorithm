package Sort;

import java.util.ArrayList;

public class MergeSort {
     public static void main(String[] args){
         int arr[] = {13, 46, 24, 52, 20, 9};
            int n = arr.length;
            System.out.println("Before Using merge Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            mergeSort(arr, 0,n-1);
             System.out.println("After Using merge Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static int[] merge(int arr[], int l, int m, int r)
    {
        ArrayList<Integer> temp=new ArrayList<Integer>();
         int left=l,right=m+1;
         while(left<=m && right<=r){
             if(arr[left]>arr[right]){
                temp.add(arr[right++]);
             }
             else{
                 temp.add(arr[left++]);
             }
         }
         while(left<=m){
             temp.add(arr[left++]);
             
         }
         while(right<=r){
             temp.add(arr[right++]);
         }
         for(int i=l;i<=r;i++){
             arr[i]=temp.get(i-l);
         }
         return arr;
         
    }
    public static int[] mergeSort(int arr[], int l, int r)
    {
        if(l>=r) return arr;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        return arr;
        
    }
    
}
