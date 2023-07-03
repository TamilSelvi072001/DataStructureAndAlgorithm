package String;

public class StringRotationCheck {
    public static void main(String[] args) {
        String s1="mightandmagic";
        String s2="andmagicmigth";
        System.out.print(areRotations(s1,s2));
    }
    public static boolean areRotations(String s1, String s2 )
    {
        if(s1.length() != s2.length()) {
            return false;
        }
        String ans=s1+s1;
        return (ans.contains(s2)) ? true:false;
    }
}
