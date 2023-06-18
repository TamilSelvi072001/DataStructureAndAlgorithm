package Array;

public class LinearSearch {
    static int searchInSorted(int arr[], int N, int K)
    {
        for(int i=0;i<N;i++){
            if(arr[i]==K){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 6;
        int K=34;
        int Arr[] = {12, 35, 1, 10, 34, 1};
        System.out.print(searchInSorted(Arr, N,K));
    }

}
