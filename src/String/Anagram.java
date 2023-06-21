package String;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.print(isAnagram("helloworld", "worldhlelo"));
        
    }
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length()) return false;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(!mp.containsKey(a.charAt(i))){
                mp.put(a.charAt(i),1);
            }
            else{
                mp.put(a.charAt(i),mp.get(a.charAt(i))+1);
            }
        }
        for(int i=0;i<b.length();i++){       
            if(mp.containsKey(b.charAt(i))){
                mp.put(b.charAt(i),mp.get(b.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        for(Map.Entry<Character,Integer> i:mp.entrySet()){
            if(i.getValue()!=0) return false;
        }
        return true;
    }
}
