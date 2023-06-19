package BinarySerch;
public class MedianRowWiseSortedMatrix {
    public static void main(String[] args) {
        int R = 3, C = 3;
        int M[][] = {{1, 3, 5}, 
            {2, 6, 9}, 
            {3, 6, 9}};
            System.out.println( median(M,R,C));
    }
     static int median(int matrix[][], int R, int C) {
        // Binary Search    
        int low = 0, high = 4000;
        while(low <= high){
            int mid = (low + high) / 2;
            int count = 0;
            for(int i = 0; i < R; i++)
                count += valCount(matrix , i, mid);
            if(count <= (R * C) / 2) 
                low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
    static int valCount(int matrix[][], int i, int val){
        int l = 0, r= matrix[i].length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(matrix[i][mid] <= val)
                l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }
}