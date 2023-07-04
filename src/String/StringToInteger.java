package String;
public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(convertStringToInteger("-12345"));
    }
    private static int convertStringToInteger(String str) {
            int count=0;
            int sum=0;
            for(int i=0;i<str.length();i++){
                int temp=(int)str.charAt(i);
                if(temp>=48 && temp<=57){
                    sum=(sum*10)+(temp-48);
                    count++;
                }
            }
            if(count!=str.length()){
                if(count==str.length()-1 && str.charAt(0)=='-'){
                    return -sum;
                }
                else{
                    return -1;
                }
            }
            return sum;
        }
}
