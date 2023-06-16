package Array;

public class LargestElement {
    public static int largest(int arr[], int n)
    {
        int max=0;
        if(n==0) return 0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={4,2,9,1,10,100};
        int ans=largest(arr,arr.length);
        System.out.print(ans);
    }
}
