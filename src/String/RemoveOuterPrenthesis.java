package String;

public class RemoveOuterPrenthesis {
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.print(removeOuter(s));
        
    }
    public static String removeOuter(String s) {
        int count=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                if(count!=1){
                    ans+="(";
                }
            }
            else{
                count--;
                if(count!=0){
                    ans+=")";
                }
                
            }
        }
        return ans;
    }
}
