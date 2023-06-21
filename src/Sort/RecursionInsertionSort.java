package Sort;

public class RecursionInsertionSort {
    public static void main(String[] args) {
         int arr[] = {13, 46, 24, 52, 20, 9};
            int n = arr.length;
            System.out.println("Before Using insertion Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            insertion_sort(arr, n , 0);
             System.out.println("After Using insertion Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    private static void insertion_sort(int[] arr,int n,int i){
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        insertion_sort(arr, n, i+1);
    }
}
