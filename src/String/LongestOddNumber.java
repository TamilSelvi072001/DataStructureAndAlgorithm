package String;

public class LongestOddNumber {
    private static String maxOdd(String s) {
        int max=Integer.MIN_VALUE;
        for(int i=s.length()-1;i>=0;i--){
            int temp=Integer.parseInt(s.charAt(i)+""); 
            if(temp%2!=0){
               return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(maxOdd("45689"));
    }
}
