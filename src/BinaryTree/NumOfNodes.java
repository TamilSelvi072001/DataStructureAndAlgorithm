package BinaryTree;
 
class NumOfNodes{
    public static void main(String[] args) {
        int nodes=findNumOfNodes(10);
        System.out.print(nodes);
    }
    public static int findNumOfNodes(int n){
        if(n==1) return n;
        return (int)Math.pow(2,n-1);
    }
}