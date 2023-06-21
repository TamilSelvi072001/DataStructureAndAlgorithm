package Sort;

public class RecursionBubbleSort {
    public static void main(String[] args) {
          int arr[] = {13, 46, 24, 52, 20, 9};
            int n = arr.length;
            System.out.println("Before Using bubble Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            bubble_sort(arr, n);
             System.out.println("After Using bubble Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    private static void bubble_sort(int[] arr,int n){
         if (n == 1) return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubble_sort(arr, n-1);
    }
}
