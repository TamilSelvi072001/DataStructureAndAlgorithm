package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        int N = 4;
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.print(longestCommonPrefix(arr, N));
    }
    private static String longestCommonPrefix(String arr[], int n){
        String temp=arr[0];
        for(int i=1;i<n;i++){
           while(arr[i].indexOf(temp)!=0){
               temp=temp.substring(0,temp.length()-1);
            }
        }
        return temp.isEmpty()? "-1":temp;
    }
}
