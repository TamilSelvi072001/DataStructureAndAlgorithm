package BinaryTree;

public class MaxHeight {
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
        int ans=maxDepth(root);
        System.out.print(ans);
    }
    public static int maxDepth(Node root) {
        if(root==null) return 0;
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        return 1+Math.max(leftHeight,rightHeight);
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
