package Array;

import java.util.HashMap;

class ValidAnagram{
    public static void main(String[] args) {
        System.out.print(isAnagram("hello","world"));
        
    }
   
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))) return false;
            map.put(t.charAt(i),map.get(t.charAt(i))-1);
        }
        for(int i:map.values()){
            if(i!=0) return false;
        }
        return true;
    }
}