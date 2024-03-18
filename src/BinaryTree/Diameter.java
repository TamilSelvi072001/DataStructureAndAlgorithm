package BinaryTree;

public class Diameter{
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
        System.out.print(diameterOfBinary(root));
    }
    public static int diameterOfBinary(Node root) {  
        int diameter[]=new int[1]; 
        int ans=inOrder(root,diameter);
        return diameter[0];
    }
    public static int inOrder(Node root, int[] diameter){
        if(root==null) return 0;
        int leftSide=inOrder(root.left,diameter);
        int rightSide=inOrder(root.right,diameter);
        diameter[0]=Math.max(diameter[0],leftSide+rightSide);
        return Math.max(leftSide,rightSide)+1;
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