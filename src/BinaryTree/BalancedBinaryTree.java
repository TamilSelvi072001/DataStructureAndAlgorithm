package BinaryTree;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        System.out.print(isBalanced(root));
    }
    public static boolean isBalanced(Node root) {
        int maxHeight=maxHeight(root);
        return maxHeight!=-1 ? true:false;        
    }
    public static int maxHeight(Node root){
        if(root==null) return 0;
        int leftHeight=maxHeight(root.left);
        int rightHeight=maxHeight(root.right);
        if((Math.abs(leftHeight-rightHeight)>1) || leftHeight==-1 || rightHeight==-1) return -1;
        return 1+(Math.max(leftHeight,rightHeight));
    }
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
// TC:O(N)
// SC:O(N) axuliary stack space
