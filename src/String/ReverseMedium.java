package String;

public class ReverseMedium {
    private static String reverseWords(String S)
    {
        // code here 
        String[] ans=S.split("\\.");
        int low=0;
        int high=ans.length-1;
        while(low<=high){
            String temp=ans[low];
            ans[low]=ans[high];
            ans[high]=temp;
            low++;
            high--;
        } 
        return String.join(".",ans);
    }
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.print(reverseWords(S));
    }
}
