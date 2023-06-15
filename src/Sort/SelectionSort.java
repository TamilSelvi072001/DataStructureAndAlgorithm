package Sort;

public class SelectionSort {
       public static void main(String[] args){
         int arr[] = {13, 46, 24, 52, 20, 9};
            int n = arr.length;
            System.out.println("Before Using selection Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            selection_sort(arr, n);
             System.out.println("After Using selection Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static int[] selection_sort(int[] arr,int n){
         for(int i=0;i<n-1;i++){
	        int min=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[min]){
	                min=j;
	            }
	        }
	        int temp=arr[i];
	        arr[i]=arr[min];
	        arr[min]=temp;
	        
	    }
        return arr;
    }
}
