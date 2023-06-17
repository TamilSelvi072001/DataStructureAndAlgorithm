package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int N = 6;
        int Arr[] = {12, 35, 1, 10, 34, 1};
        System.out.print(print2largest(Arr, N));
    }
    static int print2largest(int arr[], int n) {
        int max=Integer.MIN_VALUE;
        int secMax=max;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }
            if(secMax<arr[i] && arr[i]!=max){
                secMax=arr[i];
            }
        }
        return secMax==Integer.MIN_VALUE ? -1:secMax;
    }
}
