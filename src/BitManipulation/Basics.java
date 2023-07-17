package BitManipulation;

public class Basics {
    public static void main(String[] args) {
        int num=9;
        int i=2;
        System.out.print(bitManipulation(num,i));
    }
    public static int[] bitManipulation(int num, int i){
        int ans[]=new int[3];   
        if((num&(1<<(i-1)))>=1){
            ans[0]=1;
        }
        else{
            ans[0]=0;
        }
        ans[1]=num|(1<<(i-1));
        ans[2]=num&~(1<<(i-1));
        return ans;
    }
}
