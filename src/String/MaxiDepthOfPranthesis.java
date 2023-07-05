package String;

public class MaxiDepthOfPranthesis {
    public static void main(String[] args) {
        String s="(43+4++3)((3)(9))+1";
        System.out.print(maxDepth(s));
    }
     public static int maxDepth(String s) {
        int count1=0;
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count1++;
                if(temp<count1){
                    temp=count1;
                }
            }
            else if(s.charAt(i)==')'){
                if(count1>0){
                     count1--;
                }
            }
        }
        return count1==0 ? temp : -1;
    }
}

