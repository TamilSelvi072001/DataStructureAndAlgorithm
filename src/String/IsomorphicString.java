package String;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        String str1="aab";
        String str2="xxy";
        System.out.println(areIsomorphic(str1, str2));

    }
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length()){
            return false;
        }
        Map<Character,Character> freq1=new HashMap<>();
        Map<Character,Character> freq2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
           if((freq1.containsKey(str1.charAt(i)) && freq1.get(str1.charAt(i))!=str2.charAt(i))  || (freq2.containsKey(str2.charAt(i)) && freq2.get(str2.charAt(i))!=str1.charAt(i))){
               return false;
           }
           freq1.put(str1.charAt(i),str2.charAt(i));
           freq2.put(str2.charAt(i),str1.charAt(i));
        }
        return true;
    }
}
