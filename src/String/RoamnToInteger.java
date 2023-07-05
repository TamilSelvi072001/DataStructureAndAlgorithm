package String;

public class RoamnToInteger {
    public static void main(String[] args) {
        System.out.print(romanToDecimal("IVVIVCD"));
    }
    public static int romanToDecimal(String str) {
        int ans=0,num=0;
        for(int i=str.length()-1;i>=0;i--){
            num=value(str.charAt(i));
            if(4*num<ans)ans-=num;
            else ans+=num;
        }
        return ans;
    }
    public static int value(char ch){
        int num=0;
        switch(ch){
                case 'I':num=1;break;
                case 'V':num=5;break;
                case 'X':num=10;break;
                case 'L':num=50;break;
                case 'C':num=100;break;
                case 'D':num=500;break;
                case 'M':num=1000;break;
        }
        return num;
    }
}
