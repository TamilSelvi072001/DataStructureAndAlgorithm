package Sort;

public class InsertionSort {
    public static void main(String[] args){
         int arr[] = {13, 46, 24, 52, 20, 9};
            int n = arr.length;
            System.out.println("Before Using insertion Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            insertion_sort(arr, n);
             System.out.println("After Using insertion Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static int[] insertion_sort(int[] arr,int n){
        for(int i=0;i<n;i++){
          int j=i;
          while(j>0 && arr[j]<arr[j-1]){
              int temp=arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;
              j--;
          }
      }
      return arr;
    }
}
